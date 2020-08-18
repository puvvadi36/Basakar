package com.kp.demo.pojo;

import java.util.List;

public class ParentFieldDefinition {
	private List<String> fieldNames;
	private String uidAttribute;
	private String statusField;
	private String dateFormat;
	private List<String> multivaluedField;
	public List<String> getFieldNames() {
		return fieldNames;
	}
	public void setFieldNames(List<String> fieldNames) {
		this.fieldNames = fieldNames;
	}
	public String getUidAttribute() {
		return uidAttribute;
	}
	public void setUidAttribute(String uidAttribute) {
		this.uidAttribute = uidAttribute;
	}
	public String getStatusField() {
		return statusField;
	}
	public void setStatusField(String statusField) {
		this.statusField = statusField;
	}
	public String getDateFormat() {
		return dateFormat;
	}
	public void setDateFormat(String dateFormat) {
		this.dateFormat = dateFormat;
	}
	public List<String> getMultivaluedField() {
		return multivaluedField;
	}
	public void setMultivaluedField(List<String> multivaluedField) {
		this.multivaluedField = multivaluedField;
	}
	
	

}
