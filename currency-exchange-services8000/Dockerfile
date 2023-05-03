FROM openjdk:17-alpine


ARG JAR_FILE=/currency-exchange-services8000/target/*.jar
#ARG JAR_FILE=/target/*.jar
COPY ${JAR_FILE} app.jar

EXPOSE 8000:8000

VOLUME ./target:/app
WORKDIR /app


ENTRYPOINT ["java","-jar","/app.jar"]

