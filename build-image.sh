#! /bin/bash

./gradlew clean build -x test

JAR_FILE=$(ls build/libs/ | grep "^GatewayService")

echo $JAR_FILE
docker build . --build-arg jar=build/libs/$JAR_FILE -t ezzefiohez/finance-gateway
docker push ezzefiohez/finance-gateway

echo " ######## BUILD GATEWAY DONE ######## "

curl  -X POST http://146.59.195.214:9000/api/webhooks/cc041010-60ec-44b8-9970-a4ef3677efff
