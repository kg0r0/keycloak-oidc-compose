# RUN
```
$ docker run -p8080:8080 -it --rm --name my-maven-project -v "$(pwd)":/usr/src/mymaven -w /usr/src/mymaven maven:3.3-jdk-8 mvn spring-boot:run
```
