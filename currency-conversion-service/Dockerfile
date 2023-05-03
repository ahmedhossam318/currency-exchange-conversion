FROM openjdk:17-alpine


ARG JAR_FILE=/currency-conversion-service/target/*.jar
#ARG JAR_FILE=/target/*.jar
COPY ${JAR_FILE} app.jar

EXPOSE 8100:8100

VOLUME ./target:/app
WORKDIR /app


ENTRYPOINT ["java","-jar","/app.jar"]

