FROM maven:3.9-eclipse-temurin-17
COPY . /app
WORKDIR /app
RUN mvn clean compile
RUN mvn package
ENTRYPOINT ["mvn", "exec:java", "-Dexec.mainClass=""com.example.Main"""]