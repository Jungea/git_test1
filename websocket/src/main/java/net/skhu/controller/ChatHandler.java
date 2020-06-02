package net.skhu.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Component
public class ChatHandler extends TextWebSocketHandler {
	private List<WebSocketSession> sessionList = new ArrayList<>();

	// 클라이언트 연결
	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		System.out.println("연결됨");
		sessionList.add(session);
//		System.out.println("채팅방 입장자: " + session.getPrincipal().getName());
	}

	// 데이터 전송
	@Override
	protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
		System.out.printf("%s로부터 [%s] 받음\n", session.getId(), message.getPayload());
		for (WebSocketSession s : sessionList)
			if(s.getId().equals(session.getId()) == false)
				s.sendMessage(message);
	}

	// 클라이언트 연결 끊김
	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		sessionList.remove(session);
//		System.out.println("채팅방 퇴장자: " + session.getPrincipal().getName());
	}

}
