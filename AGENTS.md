# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## What this repository is

A Java programming course taught through Jupyter notebooks (with a Java kernel) and standalone Maven projects. Content is written in Spanish and Galician. Topics are numbered and sequential.

## Running the notebooks

Install the Python environment once:
```bash
pip install -r requirements.txt
```

Launch JupyterLab:
```bash
jupyter lab
```

The notebooks require a Java kernel (IJava). The first notebook [01Introducción/00instalacion-kernel-java.ipynb](01Introducción/00instalacion-kernel-java.ipynb) covers kernel installation.

## Building and running Maven projects

Each standalone exercise is its own Maven project with a `pom.xml`. From inside any project directory:

```bash
mvn compile          # compile
mvn exec:java        # run (requires exec plugin or a Main class configured)
mvn package          # build JAR
```

Projects target Java 21 (some newer ones target Java 24).

## Database exercises (07AccesoBD)

Start PostgreSQL and pgAdmin via Docker:
```bash
cd 07AccesoBD/docker
docker compose up -d
```

- PostgreSQL: `localhost:5432`, user `usuario`, password `renaido`, default DB `pruebas`
- pgAdmin: `http://localhost:8081`, login `admin@admin.com` / `renaido`

SQL files placed in `07AccesoBD/docker/bds/sql/` are automatically imported on container creation — each `.sql` or `.sql.gz` file becomes its own database named after the file. The init script (`bds/00_init.sh`) handles both plain SQL and `pg_dump` binary format.

Available sample databases: `lego`, `netflix`, `titanic`, `employees` (gzipped).

The PostgreSQL JDBC dependency used in Maven projects:
```xml
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <version>42.7.11</version>
</dependency>
```

## Course structure

| Directory | Topic |
|-----------|-------|
| `01Introducción/` | Types, variables, operators, I/O |
| `02Estructuras-de-control/` | Conditionals, loops + solutions in `solucions/` |
| `03POO/` | OOP basics — classes, objects, encapsulation |
| `04Estructuras_de_datos/` | Strings, arrays, ArrayList, HashMap, regex |
| `05Utilidades/` | Date/time API, Random, dotenv |
| `06POO-avanzada/` | Packages, inheritance, exceptions, abstract classes, interfaces, enums |
| `07AccesoBD/` | JDBC — connection, CRUD, transactions, DAO pattern |

Each topic follows the pattern: notebook(s) with theory + code examples → exercise statement (`.md`) → solutions in a `Solucións/` or `solucions/` subdirectory as Maven projects.

## Key patterns in the codebase

**JDBC**: Always uses `PreparedStatement` (never raw `Statement`) and `try-with-resources` for auto-closing `Connection`, `PreparedStatement`, and `ResultSet`. Dates are converted via `java.sql.Date.valueOf(localDate)`.

**DAO pattern** (07AccesoBD): Defines a `DAO` interface with query methods, and a `DAOImplementacion` class that holds the connection URL/user/password and implements each method. The program works against the interface, not the implementation.
