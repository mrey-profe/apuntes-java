#!/bin/bash
set -e

SQL_DIR="/docker-entrypoint-initdb.d/sql"

for f in "$SQL_DIR"/*.sql "$SQL_DIR"/*.sql.gz; do
    [ -f "$f" ] || continue
    filename=$(basename "$f")
    dbname="${filename%.sql.gz}"
    dbname="${dbname%.sql}"
    psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" --dbname "postgres" -c "CREATE DATABASE \"$dbname\";"
    magic=$(head -c 5 "$f" | cat -v 2>/dev/null || true)
    if [[ "$magic" == PGDMP* ]]; then
        pg_restore --exit-on-error --no-owner --no-privileges --username "$POSTGRES_USER" --dbname "$dbname" "$f"
    elif [[ "$f" == *.gz ]]; then
        gunzip -c "$f" | psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" --dbname "$dbname"
    else
        psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" --dbname "$dbname" -f "$f"
    fi
done
