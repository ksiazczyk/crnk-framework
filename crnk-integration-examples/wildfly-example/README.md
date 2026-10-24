---
type: readme
title: wildfly-example
summary: Explains how to build and run the CRNK integration example on Wildfly, including the endpoint URL and the required Accept header.
---

In order to run this example do:
* ```mvn clean package```
* ```mvn wildfly:run```
* The service will be available at: http://localhost:8080/wildfly-example/users/ (remember to put header ```Accept: application/vnd.api+json```)
