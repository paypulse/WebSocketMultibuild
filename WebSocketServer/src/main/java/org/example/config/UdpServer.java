package org.example.config;



import org.springframework.beans.factory.annotation.Value;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.net.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UdpServer{

    /**
     * 클라이언트에서 받은 문자열 출력
     * */
    public BufferedReader br;

    public void start() throws Exception{
        System.out.println("::::::::::::server start :::::::::: ");

        try{
            ServerSocket serverSocket = new ServerSocket(9666);
            System.out.println("[서버] 생성된 socket port :::" + serverSocket.getLocalPort() );
            System.out.println("[서버] 생성된 socket InetAddress :::" + serverSocket.getInetAddress() );

            Socket clientSocket = serverSocket.accept();
            System.out.println("[서버] accept 되었을때");

            InetSocketAddress clientSocketAddress = (InetSocketAddress) clientSocket.getRemoteSocketAddress();
            System.out.println("[서버] 클라이언트의 포트 번호는" + clientSocketAddress.getPort());

            br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            System.out.println(br.readLine());

        }catch (Exception e){
            e.printStackTrace();
        }


    }



}
