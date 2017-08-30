FROM openjdk:latest

CMD java \
        -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005 \
        -Dspring.data.mongodb.uri=${MONGODB_URI} \
        -jar /usr/local/executable-jar/*.jar