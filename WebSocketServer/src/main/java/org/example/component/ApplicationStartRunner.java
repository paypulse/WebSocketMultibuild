package org.example.component;



import org.example.config.UdpServer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

@Component
public class ApplicationStartRunner implements ApplicationRunner {


    @Override
    public void run(ApplicationArguments args) throws Exception {
        /**
         * 서버가 시작 되면 client 로 부터 받음
         *
         * */

        try{
           new UdpServer().start();
        }catch (IOException e){
            e.printStackTrace();
        }

    }







}
