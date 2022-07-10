package com.jesper.seckill;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication{
  public static void main(String[] args){

    SpringApplication.run(MainApplication.class, args);
  }

  // 需要先启动 rabbitmq与 redis
  // 1,  cd \"D:\\servers\\RabbitMQ Server\\rabbitmq_server-3.10.5\\sbin\" & d:
  // 2,  set ERLANG_HOME=D:\servers\Erlang
  // 3, rabbitmq-server.bat

  // 启动 redis-server 到开始屏幕上点击

  // 首页： http://localhost:8080/login/to_login


}
