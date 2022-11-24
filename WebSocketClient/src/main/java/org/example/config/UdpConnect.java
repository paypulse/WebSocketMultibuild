package org.example.config;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class UdpConnect {

    /**
     * Test 가라 data
    * */
    private static final String jsonDataTest = "{\"DEVICEID\":\"00000000001\",\"DEVICETYPE\" :\"P\",\"OPCODE\":\"119\",\"IN24V\":\"23\",\"INB24V\":\"23\",\"FT\":\"11\",\"D1\":\"00\",\"D2\":\"00\",\"D3\":\"00\",\"D4\":\"00\",\"D5\":\"00\",\"D6\":\"00\",\"D7\":\"00\",\"D8\":\"00\",\"D9\":\"00\",\"D10\":\"00\", \"D11\":\"00\",\"D12\":\"11\",\"D13\":\"00\",\"D14\":\"00\",\"D15\":\"00\",\"D16\":\"00\",\"D17\":\"00\",\"D18\":\"00\",\"D19\": \"00\",\"D20\":\"00\",\"D21\":\"00\",\"D22\":\"00\",\"D23\":\"00\",\"D24\":\"00\",\"D25\":\"00\",\"D26\":\"00\",\"D27\":\"00\",\" D28\":\"00\",\"D29\":\"00\",\"D30\":\"00\",\"D31\":\"00\",\"D32\":\"00\",\"D33\":\"00\",\"D34\":\"00\",\"D35\":\"00\",\"D36\":\" 00\",\"D37\":\"00\",\"D38\":\"00\",\"D39\":\"00\",\"D40\":\"00\",\"D41\":\"00\",\"D42\":\"00\",\"D43\":\"00\",\"D44\":\"00\",\" D45\":\"00\",\"D46\":\"00\",\"D47\":\"00\",\"D48\":\"00\",\"D49\":\"00\",\"D50\":\"00\",\"D51\":\"00\",\"D52\":\"00\",\"D53\":\" 00\",\"D54\":\"00\",\"D55\":\"00\",\"D56\":\"00\",\"D57\":\"00\",\"D58\":\"00\",\"D59\":\"00\",\"D60\":\"00\",\"D61\":\"00\",\" D62\":\"00\",\"D63\":\"00\",\"D64\":\"00\",\"D65\":\"00\",\"D66\":\"00\",\"D67\":\"00\",\"D68\":\"00\",\"D69\":\"00\",\"D70\":\" 00\",\"D71\":\"00\",\"D72\":\"00\",\"D73\":\"00\",\"D74\":\"00\",\"D75\":\"00\",\"D76\":\"00\",\"D77\":\"00\",\"D78\":\"00\",\" D79\":\"00\",\"D80\":\"00\"}" + "\r\n";

    /**
     * server로 message 보내기
     * */
    private PrintWriter pw;

    public UdpConnect(String ip,int port){
        System.out.println("[클라이언트] 접속 test");
        Socket socket  =new Socket();

        try{
            System.out.println("[클라이언트] 서버측으로 연결 요청");
            socket.connect(new InetSocketAddress(ip, port));

            System.out.println("[클라이언트] 서버와 연결 성공");
            pw = new PrintWriter(socket.getOutputStream());
            pw.println(jsonDataTest);
            pw.flush();

        }catch (Exception e){
            e.printStackTrace();
        }


    }

}
