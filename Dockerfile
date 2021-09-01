FROM openjdk:11
ADD target/demo.jar demo.jar
EXPOSE 8086
ENTRYPOINT ["java","-jar","demo.jar"]