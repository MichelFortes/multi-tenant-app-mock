FROM amazoncorretto:17.0.7
WORKDIR /app

COPY target/app.jar .
CMD java -jar app.jar