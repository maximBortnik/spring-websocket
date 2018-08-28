package com.websocket.springwebsocket;

import com.websocket.springwebsocket.config.WebSocketConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Configuration
@Import(WebSocketConfig.class)
public class SpringWebsocketApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebsocketApplication.class, args);
	}
}
