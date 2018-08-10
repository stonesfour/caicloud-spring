# 版本信息
FROM primetoninc/jdk:1.8
MAINTAINER stonesfour "sunshilei@caicloud.io"


# change path to your repo dir
COPY ./demo-provider/target/demo-provider-0.0.1-SNAPSHOT.jar  /demo-provider.jar

EXPOSE 8088

CMD ["java", "-jar", "/demo-provider.jar"]
