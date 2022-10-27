#!/bin/bash
mvn clean verify jib:dockerBuild -DskipTests=true