# Importación de ficheiros de BD a pgadmin

Crea primeiro a base de datos e despois importa os ficheiros por liña de comandos:

## Ficheiros `.sql`

```bash
psql -U postgres -d nome_da_base_de_datos -f ficheiro.sql
```

## Ficheiros `.sql.gz`

```bash
pg_restore -U postgres --no-owner --no-privileges-d nome_da_base_de_datos ficheiro.sql.gz
```