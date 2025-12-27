FROM eclipse-temurin:17
WORKDIR /app
COPY target/springboot-cicd1.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
