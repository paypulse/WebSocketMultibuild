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
         * socket server 확인
         *
         * */
        new UdpServer().start();
    }







}
