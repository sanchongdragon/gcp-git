FROM adoptopenjdk/openjdk11
EXPOSE 8080
ARG JAR_FILE=target/*.jar
ADD ${JAR_FILE} gaedemo.jar
ENTRYPOINT ["java","-jar","/gaedemo.jar"]