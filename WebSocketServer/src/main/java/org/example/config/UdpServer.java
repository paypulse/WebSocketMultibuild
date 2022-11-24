package org.example.config;



import org.springframework.beans.factory.annotation.Value;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpServer {

    @Value("${server.port}")
    public static int port;

    public void start() throws IOException {

        System.out.println("Udp Start");
        /**
         * 소켓을 생성
         * */
        DatagramSocket socket = new DatagramSocket(9696);

        System.out.println("Socket :" + socket);
        DatagramPacket inpacket , outpacket;

        /**
         * 받을 message
         * */
        byte[] byteArray  = new byte[1000];
        byte[] outMsg;

        while(true){
            /**
             * 데이터를 수신하기 위한 패킷을 생성
             * */
            inpacket = new DatagramPacket(byteArray, byteArray.length);
            System.out.println("inpacket : " + inpacket);

            /**
             * 패킷을 통해 데이터 수신
             * */
            socket.receive(inpacket);

            /**
             *수신한 패킷으로 부터 client의 ip 주소와 port 얻기
             * **/
            InetAddress address = inpacket.getAddress();
            int port = inpacket.getPort();

            System.out.println("address  :::"+address);
            System.out.println("port :::" + port);
            System.out.println(inpacket.getData());


        }

        






    }
}
