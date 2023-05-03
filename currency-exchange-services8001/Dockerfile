FROM openjdk:17-alpine


ARG JAR_FILE=/currency-exchange-services8001/target/*.jar
#ARG JAR_FILE=/target/*.jar
COPY ${JAR_FILE} app.jar

EXPOSE 8001:8001

VOLUME ./target:/app
WORKDIR /app


ENTRYPOINT ["java","-jar","/app.jar"]

