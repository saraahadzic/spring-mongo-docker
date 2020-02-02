FROM maven:3.5-jdk-8 AS build

COPY pom.xml /pom.xml
COPY src /src
WORKDIR /
RUN mvn -Dmaven.test.skip=true package
ENTRYPOINT mvn spring-boot:run -Dspring-boot.run.arguments="--spring.data.mongodb.host=$MONGO_DB_HOST --spring.data.mongodb.database=$MONGO_DB_NAME spring.data.mongodb.port=$MONGO_DB_PORT --server.port=$APP_PORT"
