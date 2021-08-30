FROM openjdk:8
ADD target/demo.jar demo.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","Online-Banking-System.jar"]