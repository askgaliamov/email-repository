# Sore JSON into MySQL database

## Require
Java 8

## Configuration
Set DB properties in:

src/main/resources/config.properties

test/functional/src/test/resources/config.properties

build.gradle (dbURL, dbUser, dbPassword)

## Create DB scheme
./gradlew flywayMigrate -i

## Run tests
./gradlew run (and keep it runned)

./gradlew test

## Run service
./gradlew run
