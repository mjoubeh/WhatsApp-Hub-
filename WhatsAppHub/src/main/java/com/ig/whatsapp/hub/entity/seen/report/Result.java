package com.ig.whatsapp.hub.entity.seen.report;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "messageId", "to", "sentAt", "seenAt" })
public class Result {

	@JsonProperty("messageId")
	private String messageId;
	@JsonProperty("to")
	private String to;
	@JsonProperty("sentAt")
	private String sentAt;
	@JsonProperty("seenAt")
	private String seenAt;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@Override
	public String toString() {
		return "Result [messageId=" + messageId + ", to=" + to + ", sentAt=" + sentAt + ", seenAt=" + seenAt
				+ ", additionalProperties=" + additionalProperties + "]";
	}

	@JsonProperty("messageId")
	public String getMessageId() {
		return messageId;
	}

	@JsonProperty("messageId")
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	@JsonProperty("to")
	public String getTo() {
		return to;
	}

	@JsonProperty("to")
	public void setTo(String to) {
		this.to = to;
	}

	@JsonProperty("sentAt")
	public String getSentAt() {
		return sentAt;
	}

	@JsonProperty("sentAt")
	public void setSentAt(String sentAt) {
		this.sentAt = sentAt;
	}

	@JsonProperty("seenAt")
	public String getSeenAt() {
		return seenAt;
	}

	@JsonProperty("seenAt")
	public void setSeenAt(String seenAt) {
		this.seenAt = seenAt;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}