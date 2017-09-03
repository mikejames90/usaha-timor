# Prerequisite
- Java JDK
- JAVA_HOME environment variable is set
- IDE (Eclipse, NetBeans or IntellJ)
- Docker (optional), recommended

# How to build
```
mvnw clean package
```

# How to run the app

### Running with docker
- Make sure application has been built
- Run following command
```
cd docker
docker-compose up
```

### Running using plain java (faster performace)
- Make sure application has been built
- Make sure database is running
- Run following command
```
java -jar target/usaha-timor-*.jar 
```

- By default application will look for database at:
```
spring.datasource.url=jdbc:mysql://localhost:3306/usti?useSSL=false
spring.datasource.username=user
spring.datasource.password=password
```

- If you need to modify this database connection
```
java -Dspring.datasource.url=<JDBC URL> -Dspring.datasource.username=<DB_USERNAME> -Dspring.datasource.password=<DB_PASSWORD> -jar target/usaha-timor-*.jar 

```

### Running just the mysql database in docker
If you wish to only run the database in docker and run the app in native java, you can start
the database with following command
```
cd docker
docker-compose up mysql
```

# Useful Documentation
https://vuejs.org/v2/guide/
https://bootstrap-vue.js.org/docs
