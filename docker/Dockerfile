FROM openjdk:latest

CMD java \
        -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005 \
        -Dspring.datasource.url=${DATASOURCE_URL} \
        -Dspring.datasource.username=${MYSQL_USER} \
        -Dspring.datasource.password=${MYSQL_PASSWORD} \
        -jar /usr/local/executable-jar/*.jar