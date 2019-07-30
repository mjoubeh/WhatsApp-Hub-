package com.ig.whatsapp.hub.entity.incoming.message;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "from", "to", "integrationType", "receivedAt", "messageId", "pairedMessageId", "callbackData",
		"message", "price" })
public class Result {

	@JsonProperty("from")
	private String from;
	@JsonProperty("to")
	private String to;
	@JsonProperty("integrationType")
	private String integrationType;
	@JsonProperty("receivedAt")
	private String receivedAt;
	@JsonProperty("messageId")
	private String messageId;
	@JsonProperty("pairedMessageId")
	private Object pairedMessageId;
	@JsonProperty("callbackData")
	private Object callbackData;
	@JsonProperty("message")
	private Message message;
	@JsonProperty("price")
	private Price price;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@Override
	public String toString() {
		return "Result [from=" + from + ", to=" + to + ", integrationType=" + integrationType + ", receivedAt="
				+ receivedAt + ", messageId=" + messageId + ", pairedMessageId=" + pairedMessageId + ", callbackData="
				+ callbackData + ", message=" + message + ", price=" + price + ", additionalProperties="
				+ additionalProperties + "]";
	}

	@JsonProperty("from")
	public String getFrom() {
		return from;
	}

	@JsonProperty("from")
	public void setFrom(String from) {
		this.from = from;
	}

	@JsonProperty("to")
	public String getTo() {
		return to;
	}

	@JsonProperty("to")
	public void setTo(String to) {
		this.to = to;
	}

	@JsonProperty("integrationType")
	public String getIntegrationType() {
		return integrationType;
	}

	@JsonProperty("integrationType")
	public void setIntegrationType(String integrationType) {
		this.integrationType = integrationType;
	}

	@JsonProperty("receivedAt")
	public String getReceivedAt() {
		return receivedAt;
	}

	@JsonProperty("receivedAt")
	public void setReceivedAt(String receivedAt) {
		this.receivedAt = receivedAt;
	}

	@JsonProperty("messageId")
	public String getMessageId() {
		return messageId;
	}

	@JsonProperty("messageId")
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	@JsonProperty("pairedMessageId")
	public Object getPairedMessageId() {
		return pairedMessageId;
	}

	@JsonProperty("pairedMessageId")
	public void setPairedMessageId(Object pairedMessageId) {
		this.pairedMessageId = pairedMessageId;
	}

	@JsonProperty("callbackData")
	public Object getCallbackData() {
		return callbackData;
	}

	@JsonProperty("callbackData")
	public void setCallbackData(Object callbackData) {
		this.callbackData = callbackData;
	}

	@JsonProperty("message")
	public Message getMessage() {
		return message;
	}

	@JsonProperty("message")
	public void setMessage(Message message) {
		this.message = message;
	}

	@JsonProperty("price")
	public Price getPrice() {
		return price;
	}

	@JsonProperty("price")
	public void setPrice(Price price) {
		this.price = price;
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