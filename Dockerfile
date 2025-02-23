# First stage: Build the JAR
FROM maven:3.8.6-openjdk-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Second stage: Run the application
FROM openjdk:17
WORKDIR /app
COPY --from=build /app/target/course-service.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
