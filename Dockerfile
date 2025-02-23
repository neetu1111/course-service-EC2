# Second stage: Run the application
FROM openjdk:17
WORKDIR /app
COPY --from=build /app/target/course-service.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
