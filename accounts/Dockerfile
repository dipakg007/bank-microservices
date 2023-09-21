# Start with a base image containing Java runtime
FROM openjdk as build

# Information around who maintains the image
MAINTAINER cfdhbank.com

# Add the application jar to the container
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

# Execute the application
ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]

