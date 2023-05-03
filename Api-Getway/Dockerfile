FROM openjdk:17-alpine

ARG JAR_FILE=/Api-Getway/target/*.jar
COPY ${JAR_FILE} app.jar

EXPOSE 8765:8765

VOLUME ./target:/app
WORKDIR /app

ENTRYPOINT ["java","-jar","/app.jar"]

