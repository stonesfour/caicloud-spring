# 版本信息 
FROM primetoninc/jdk:1.8
MAINTAINER stonesfour "sunshilei@caicloud.io"

# change path to your repo dir
COPY ./caicloud-zuul-gateway/target/caicloud-zuul-gateway-0.0.1-SNAPSHOT.jar  /caicloud-zuul-gateway.jar

EXPOSE 8083

CMD ["java", "-jar", "/caicloud-zuul-gateway.jar"]