FROM openjdk:17
EXPOSE 9090
ADD target/springboot-mongo-docker.jar springboot-mongo-docker.jar
ENTRYPOINT ["java","-jar","/springboot-mongo-docker.jar"]