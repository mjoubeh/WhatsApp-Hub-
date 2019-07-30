package com.ig.whatsapp.hub.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	@KafkaListener(topics = "messages", groupId = "group_id")
	public String consume(String message) {
		return String.format("$$ -> Consumed Message -> %s", message);
	}
}
