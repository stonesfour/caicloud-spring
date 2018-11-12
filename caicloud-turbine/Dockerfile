FROM primetoninc/jdk:1.8

LABEL maintainer "luomin@caicloud.io"

ENV TURBINE_PORT=8989
ENV TURBINE_NAME=turbine
ENV EUREKA_URL=http://eureka-server:8761/eureka

COPY ./caicloud-turbine/target/caicloud-turbine-0.0.1-SNAPSHOT.jar  /app.jar

ENTRYPOINT [ "sh","-c","java -jar $PARAM /app.jar"]