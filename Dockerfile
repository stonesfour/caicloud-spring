#版本信息
FROM primetoninc/jdk:1.8
MAINTAINER stonesfour "sunshilei@caicloud.io"

#RUN mkdir /var/target

ADD zipkin.jar /zipkin.jar

EXPOSE 9411

CMD ["java", "-jar", "/zipkin.jar"]
