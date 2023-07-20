FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ./target/demo.jenkins-0.1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]







# cmd build image api
# docker build -t jenkinsapi .

# cmd run image by port 8001
# docker run --name springApi -p 8001:8080 jenkinsapi