# springboot-grpc-docker
Springboot + gRPC + Mysql + Docker

How to run it :

1. First you need install Docker deamon, Docker compose and SET bash to run from terminal
2. Git clone to your local machine
3. Build image :
 cd springboot-grpc-demo
 run : docker build -t spring-grpc-demo .
 it will take some minutes to download dependencies and build image.
4. cd to outside folder
5. run :  docker-compose up
 it also take some minutes to bring up springboot app, when you see information below, that means it worked : 
 
 app-server_1  | 2020-12-02 06:08:41.444  INFO 1 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
app-server_1  | 2020-12-02 06:08:41.448  INFO 1 --- [           main] com.thanh.SpringGrpcDemoApplication      : Started SpringGrpcDemoApplication in 7.55 seconds (JVM running for 8.158)
app-server_1  | 2020-12-02 06:08:41.450  INFO 1 --- [           main] o.l.springboot.grpc.GRpcServerRunner     : Starting gRPC Server ...
app-server_1  | 2020-12-02 06:08:41.503  INFO 1 --- [           main] o.l.springboot.grpc.GRpcServerRunner     : 'com.thanh.controller.SeatController' service has been registered.
app-server_1  | 2020-12-02 06:08:41.803  INFO 1 --- [           main] o.l.springboot.grpc.GRpcServerRunner     : gRPC Server started, listening on port 6565.

6. To see data in mysql database :
run below command interminal :
mysql -h localhost -P 3306 --protocol=tcp -u dea_spring_user -p dea_spring_user

 
 
 
  
