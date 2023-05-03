FROM openjdk:17-alpine


ARG JAR_FILE=/spring-cloud-config-server/target/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8888:8888

VOLUME ./target:/app

WORKDIR /app

ENTRYPOINT ["java","-jar","/app.jar"]

