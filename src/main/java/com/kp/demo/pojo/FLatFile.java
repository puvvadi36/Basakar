package com.kp.demo.pojo;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("FLatFile")
public class FLatFile {
	

	private String tenantId;
	@Id
	private String id;
	private String name;
	private String type;
	private String fileName;
	private String applicationName;
	private String enrichmentType;
	private Delimiter delimiter;
	private AccountDefinition accountDefinition;
	private ParentFieldDefinition parentFieldDefinition;
	private List<MultivaluedFieldDefinition> multivaluedFieldDefinition;
	private List<Preview> preview;
	public String getTenantId() {
		return tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getApplicationName() {
		return applicationName;
	}
	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}
	public String getEnrichmentType() {
		return enrichmentType;
	}
	public void setEnrichmentType(String enrichmentType) {
		this.enrichmentType = enrichmentType;
	}
	public Delimiter getDelimiter() {
		return delimiter;
	}
	public void setDelimiter(Delimiter delimiter) {
		this.delimiter = delimiter;
	}
	public AccountDefinition getAccountDefinition() {
		return accountDefinition;
	}
	public void setAccountDefinition(AccountDefinition accountDefinition) {
		this.accountDefinition = accountDefinition;
	}
	public ParentFieldDefinition getParentFieldDefinition() {
		return parentFieldDefinition;
	}
	public void setParentFieldDefinition(ParentFieldDefinition parentFieldDefinition) {
		this.parentFieldDefinition = parentFieldDefinition;
	}
	public List<MultivaluedFieldDefinition> getMultivaluedFieldDefinition() {
		return multivaluedFieldDefinition;
	}
	public void setMultivaluedFieldDefinition(List<MultivaluedFieldDefinition> multivaluedFieldDefinition) {
		this.multivaluedFieldDefinition = multivaluedFieldDefinition;
	}
	public List<Preview> getPreview() {
		return preview;
	}
	public void setPreview(List<Preview> preview) {
		this.preview = preview;
	}
	
	
	
	
	

}
