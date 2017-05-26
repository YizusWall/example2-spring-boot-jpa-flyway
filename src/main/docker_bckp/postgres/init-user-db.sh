#!/bin/bash
set -e

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" <<-EOSQL
    CREATE USER cacti PASSWORD 'cacti';
    CREATE DATABASE cacti_data OWNER cacti;
    GRANT ALL PRIVILEGES ON DATABASE cacti_data TO cacti;
EOSQL