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
@JsonPropertyOrder({ "pricePerMessage", "currency" })
public class Price {

	@JsonProperty("pricePerMessage")
	private Double pricePerMessage;
	@JsonProperty("currency")
	private String currency;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@Override
	public String toString() {
		return "Price [pricePerMessage=" + pricePerMessage + ", currency=" + currency + ", additionalProperties="
				+ additionalProperties + "]";
	}

	@JsonProperty("pricePerMessage")
	public Double getPricePerMessage() {
		return pricePerMessage;
	}

	@JsonProperty("pricePerMessage")
	public void setPricePerMessage(Double pricePerMessage) {
		this.pricePerMessage = pricePerMessage;
	}

	@JsonProperty("currency")
	public String getCurrency() {
		return currency;
	}

	@JsonProperty("currency")
	public void setCurrency(String currency) {
		this.currency = currency;
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