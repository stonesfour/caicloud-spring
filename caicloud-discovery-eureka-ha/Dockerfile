# 版本信息
FROM primetoninc/jdk:1.8
MAINTAINER stonesfour "sunshilei@caicloud.io"

# change path to your repo dir
COPY ./caicloud-discovery-eureka-ha/target/caicloud-discovery-eureka-ha-0.0.1-SNAPSHOT.jar  /caicloud-discovery-eureka-ha.jar

EXPOSE 8761

CMD ["java", "-jar", "/caicloud-discovery-eureka-ha.jar"]