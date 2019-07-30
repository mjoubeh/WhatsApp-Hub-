package com.ig.whatsapp.hub.entity.incoming.message;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "results", "messageCount", "pendingMessageCount" })
public class IncomingMessage {

	@JsonProperty("results")
	private List<Result> results = null;
	@JsonProperty("messageCount")
	private Integer messageCount;
	@JsonProperty("pendingMessageCount")
	private Integer pendingMessageCount;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@Override
	public String toString() {
		return "IncomingMessage [results=" + results + ", messageCount=" + messageCount + ", pendingMessageCount="
				+ pendingMessageCount + ", additionalProperties=" + additionalProperties + "]";
	}

	@JsonProperty("results")
	public List<Result> getResults() {
		return results;
	}

	@JsonProperty("results")
	public void setResults(List<Result> results) {
		this.results = results;
	}

	@JsonProperty("messageCount")
	public Integer getMessageCount() {
		return messageCount;
	}

	@JsonProperty("messageCount")
	public void setMessageCount(Integer messageCount) {
		this.messageCount = messageCount;
	}

	@JsonProperty("pendingMessageCount")
	public Integer getPendingMessageCount() {
		return pendingMessageCount;
	}

	@JsonProperty("pendingMessageCount")
	public void setPendingMessageCount(Integer pendingMessageCount) {
		this.pendingMessageCount = pendingMessageCount;
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