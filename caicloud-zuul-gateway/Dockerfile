# 版本信息 
FROM primetoninc/jdk:1.8
MAINTAINER stonesfour "sunshilei@caicloud.io"

ENV ZUUL_NAME=zuul-gateway
ENV ZUUL_PORT=8080
ENV EUREKA_URL=http://eureka:8761/eureka

# change path to your repo dir
COPY ./caicloud-zuul-gateway/target/caicloud-zuul-gateway-0.0.1-SNAPSHOT.jar  /caicloud-zuul-gateway.jar

CMD ["java", "-jar", "/caicloud-zuul-gateway.jar"]