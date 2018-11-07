# 版本信息
FROM primetoninc/jdk:1.8
MAINTAINER stonesfour "sunshilei@caicloud.io"

ENV eurekaPort=8671

ENV eurekaHostName=localhost

# change path to your repo dir
COPY ./caicloud-discovery-eureka/target/caicloud-discovery-eureka-0.0.1-SNAPSHOT.jar  /caicloud-discovery-eureka.jar

EXPOSE 8761

CMD ["java", "-jar", "/caicloud-discovery-eureka.jar"]