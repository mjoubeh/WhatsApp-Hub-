package com.ig.whatsapp.hub.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ig.whatsapp.hub.entity.incoming.message.IncomingMessage;
import com.ig.whatsapp.hub.entity.seen.report.SeenReport;

@RestController
@RequestMapping("/api/incoming/v01")
public class IncomingRequestsController {

	@PostMapping("/message")
	public void message(@RequestBody IncomingMessage msg) {
		System.out.println("Msg Recivied " + msg);

	}

	@PostMapping("/seenReport")
	public void seenReport(@RequestBody SeenReport report) {
		System.out.println("Report Received " + report);

	}

}
