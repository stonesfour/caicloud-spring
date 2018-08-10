# 版本信息
FROM primetoninc/jdk:1.8
MAINTAINER stonesfour "sunshilei@caicloud.io"


# change path to your repo dir
COPY ./demo-consumer/target/demo-consumer-0.0.1-SNAPSHOT.jar  /demo-consumer.jar

EXPOSE 8089

CMD ["java", "-jar", "/demo-consumer.jar"]
