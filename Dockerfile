FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/test-docker.jar test-docker.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/test-docker.jar"]