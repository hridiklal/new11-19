# Use Eclipse Temurin JDK 11 as base image (official OpenJDK builds)
FROM eclipse-temurin:11-jre-jammy

# Set working directory
WORKDIR /app

# Create a non-root user for security
RUN groupadd -r spring && useradd --no-log-init -r -g spring spring
USER spring:spring

# Copy the JAR file from target directory
COPY target/cicd-demo-1.0.0-jar-with-dependencies.jar app.jar

# Expose port (if your app uses web services)
# EXPOSE 8080

# Set JVM options
ENV JAVA_OPTS="-Xmx512m"

# Run the application
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar app.jar"]
