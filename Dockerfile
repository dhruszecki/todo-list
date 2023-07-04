# Fetching latest version of Java
FROM eclipse-temurin:17
# Setting up work directory
WORKDIR /app
# Copy the jar file into our app
COPY ./target/*.jar /app/todo-list.jar

# Exposing port 8080
EXPOSE 8080

# Starting the application
CMD ["java", "-jar", "todo-list.jar"]