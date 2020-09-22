FROM java:8
EXPOSE 8080
ADD /target/docker-0.1.jar docker.jar
ENTRYPOINT ["java", "-jar", "docker.jar"]