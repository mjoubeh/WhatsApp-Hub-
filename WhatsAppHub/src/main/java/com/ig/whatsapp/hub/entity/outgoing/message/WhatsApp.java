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
@JsonPropertyOrder({ "templateName", "templateNamespace", "templateData", "language" })
public class WhatsApp {

	@JsonProperty("templateName")
	private String templateName;
	@JsonProperty("templateNamespace")
	private String templateNamespace;
	@JsonProperty("templateData")
	private List<String> templateData = null;
	@JsonProperty("language")
	private String language;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@Override
	public String toString() {
		return "WhatsApp [templateName=" + templateName + ", templateNamespace=" + templateNamespace + ", templateData="
				+ templateData + ", language=" + language + ", additionalProperties=" + additionalProperties + "]";
	}

	@JsonProperty("templateName")
	public String getTemplateName() {
		return templateName;
	}

	@JsonProperty("templateName")
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	@JsonProperty("templateNamespace")
	public String getTemplateNamespace() {
		return templateNamespace;
	}

	@JsonProperty("templateNamespace")
	public void setTemplateNamespace(String templateNamespace) {
		this.templateNamespace = templateNamespace;
	}

	@JsonProperty("templateData")
	public List<String> getTemplateData() {
		return templateData;
	}

	@JsonProperty("templateData")
	public void setTemplateData(List<String> templateData) {
		this.templateData = templateData;
	}

	@JsonProperty("language")
	public String getLanguage() {
		return language;
	}

	@JsonProperty("language")
	public void setLanguage(String language) {
		this.language = language;
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