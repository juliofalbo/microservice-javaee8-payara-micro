#!/usr/bin/env bash

mvn clean package payara-micro:bundle payara-micro:start
#java -jar payara-micro-5.184.jar --deploy api/target/customer-api-1.0.0-SNAPSHOT.war