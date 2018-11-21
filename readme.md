# spring cloud 组件容器化部署
- zipkin：分布式链路跟踪系统
- onfig-server：配置中心服务
- turbine：聚合Hystrix监控数据
- eureka：高可用的服务发现中心
- hustrix-dashboard：hystrix监控面板
- zuul：服务网关

# 测试demo
## I-相关代码
- caicloud-spring/caicloud-consumer-movie: 服务调用方
- caicloud-spring/caicloud-provider-user: 服务提供方

## II-设置eureka，zipkin，config-server服务地址
- caicloud-spring/caicloud-consumer-movie/src/main/resources/bootstrap.yml

- caicloud-spring/caicloud-provider-user/src/main/resources/application.yml

>当不使用hystrix或者eureka时，需要去掉主类的注解.

## III-启动
- java环境启动：直接运行target目录下的jar包，如：java -jar target/caicloud-consumer-movie-0.0.1-SNAPSHOT.jar
- 镜像启动：在caicloud-spring路径下，运行` docker build -f <demo-path>/Dockerfile -t demo-tag . `,然后运行镜像.

## IV-结果
当6个组件都启动时，且测试项目启动正常:
- eureka: 访问 `http://<eureka-url> `,可以看见测试项目已经注册，对应的serviceID为：caicloud-consumer-movie，caicloud-provider-user.
- zuul: 默认通过serviceID访问对应服务，如：`http://<zuul-url>/caicloud-consumer-movie/invoke_hello`，访问 caicloud-consumer-movie的invoke_hello地址.
- turbine：启动turbine时通过turbine环境变量`APP_CONFIG`指定哪些聚合哪些service，值为serviceID（逗号分割）,当持续访问`http://<caicloud-consumer-movie>/invoke_hello`,在`http://<turbine-url>/turbine.stream`可以看见有相应的日志.
- hystrix-dashboard: 直接访问`http://<hystrix-dashboard>`,按照网页上的提示填入turbine stream地址，然后持续访问`http://<caicloud-consumer-movie>/invoke_hello`，可以看见对应图形化输出.
- config-server: 启动config-server时指定 `GIT_URL` 配置仓库地址，访问测试项目 `http://<caicloud-consumer-movie>/invoke_config`,可以看见对应的输出，git仓库配置文件需要按照 serviceID[-suffix]命名,如`https://github.com/moshuipan/config-repo/blob/master/caicloud-consumer-movie.yml`.
- zipkin: 访问`http://<zipkin-url>/zipkin`,然后持续访问`http://<caicloud-consumer-movie>/invoke_hello`，可以看见对应图形化输出.