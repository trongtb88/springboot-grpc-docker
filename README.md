# springboot-grpc-docker
Springboot + gRPC + Mysql + Docker

How to run it :

First you need install Docker deamon, Docker compose and SET bash to run from terminal for Windows OS : 
- https://docs.docker.com/docker-for-windows/ 
- https://docs.docker.com/compose/install/

Git clone to your local machine
```sh
$ git clone https://github.com/trongtb88/springboot-grpc-docker.git
```
Build image : 
```sh
$ cd springboot-grpc-demo
$ docker build -t spring-grpc-demo .
```
It will take some minutes to download dependencies and build image, after build successfuly, you need to run 2 below commands.

```sh
$ cd ..
$ docker-compose up
```
It also take some minutes to bring up springboot app, when you see information below, that means it worked :

app-server_1 | 2020-12-02 06:08:41.444 INFO 1 --- [ main] o.s.b.w.embedded.tomcat.TomcatWebServer : Tomcat started on port(s): 8080 (http) with context path '' app-server_1 | 2020-12-02 06:08:41.448 INFO 1 --- [ main] com.thanh.SpringGrpcDemoApplication : Started SpringGrpcDemoApplication in 7.55 seconds (JVM running for 8.158) app-server_1 | 2020-12-02 06:08:41.450 INFO 1 --- [ main] o.l.springboot.grpc.GRpcServerRunner : Starting gRPC Server ... app-server_1 | 2020-12-02 06:08:41.503 INFO 1 --- [ main] o.l.springboot.grpc.GRpcServerRunner : 'com.thanh.controller.SeatController' service has been registered. app-server_1 | 2020-12-02 06:08:41.803 INFO 1 --- [ main] o.l.springboot.grpc.GRpcServerRunner : gRPC Server started, listening on port 6565.

To see data in mysql database : 
run below command interminal
```sh
$ mysql -h localhost -P 3306 --protocol=tcp -u dea_spring_user -p dea_spring_user
```

To call grpc server from client, you can use BloomGrpc
- https://github.com/uw-labs/bloomrpc/blob/master/README.md
- Choose proto file
- Copy & Paste localhost:6565 to Textbox address and run command
 
 
 
  
