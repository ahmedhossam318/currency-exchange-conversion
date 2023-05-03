FROM openjdk:17-alpine


ARG JAR_FILE=/limits-service/target/*.jar
COPY ${JAR_FILE} app.jar

EXPOSE 8080:8080

VOLUME ./target:/app
WORKDIR /app

ENTRYPOINT ["java","-jar","/app.jar"]

