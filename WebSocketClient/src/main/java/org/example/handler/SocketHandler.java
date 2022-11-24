package org.example.handler;


import org.springframework.stereotype.Component;


import java.util.HashMap;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;



@Component
public class SocketHandler extends TextWebSocketHandler {

    /**
     * 웹 소켓 세션을 담아둘 맵
     * */
    HashMap<String, WebSocketSession> sessionMap = new HashMap<>();


}
