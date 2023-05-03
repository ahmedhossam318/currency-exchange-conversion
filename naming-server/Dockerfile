FROM openjdk:17-alpine


ARG JAR_FILE=/naming-server/target/*.jar
COPY ${JAR_FILE} app.jar

EXPOSE 8761:8761

VOLUME ./target:/app
WORKDIR /app
ENTRYPOINT ["java","-jar","/app.jar"]

