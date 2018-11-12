FROM primetoninc/jdk:1.8

LABEL maintainer "luomin@caicloud.io"

ENV ZIPKIN_NAME=zipkin-server
ENV ZIPKIN_PORT=9411
ENV ENABLE_EUREKA=true
ENV EUREKA_URL=http://eureka-server:8761/eureka

COPY ./caicloud-zipkin-server/target/zipkin-server-0.0.1-SNAPSHOT.jar  /app.jar

ENTRYPOINT [ "sh","-c","java -jar $PARAM /app.jar"]