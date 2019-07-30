package com.ig.whatsapp.hub.entity.outgoing.message;

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
@JsonPropertyOrder({ "scenarioKey", "destinations", "whatsApp" })
public class OutMessage {

	@JsonProperty("scenarioKey")
	private String scenarioKey;
	@JsonProperty("destinations")
	private List<Destination> destinations = null;
	@JsonProperty("whatsApp")
	private WhatsApp whatsApp;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@Override
	public String toString() {
		return "OutMessage [scenarioKey=" + scenarioKey + ", destinations=" + destinations + ", whatsApp=" + whatsApp
				+ ", additionalProperties=" + additionalProperties + "]";
	}

	@JsonProperty("scenarioKey")
	public String getScenarioKey() {
		return scenarioKey;
	}

	@JsonProperty("scenarioKey")
	public void setScenarioKey(String scenarioKey) {
		this.scenarioKey = scenarioKey;
	}

	@JsonProperty("destinations")
	public List<Destination> getDestinations() {
		return destinations;
	}

	@JsonProperty("destinations")
	public void setDestinations(List<Destination> destinations) {
		this.destinations = destinations;
	}

	@JsonProperty("whatsApp")
	public WhatsApp getWhatsApp() {
		return whatsApp;
	}

	@JsonProperty("whatsApp")
	public void setWhatsApp(WhatsApp whatsApp) {
		this.whatsApp = whatsApp;
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