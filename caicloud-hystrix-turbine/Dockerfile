# 版本信息 
FROM primetoninc/jdk:1.8
MAINTAINER stonesfour "sunshilei@caicloud.io"

# change path to your repo dir
COPY ./caicloud-hystrix-turbine/target/caicloud-hystrix-turbine-0.0.1-SNAPSHOT.jar  /caicloud-hystrix-turbine.jar

EXPOSE 8010

CMD ["java", "-jar", "/caicloud-hystrix-turbine.jar"]