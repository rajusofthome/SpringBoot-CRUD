package com.example.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "APPCONFIG", schema = "crud")
public class AppConfig {

	@Id
	@Column(name = "KEY")
	private String key;

	@Column(name = "VALUE")
	private String value;

	public AppConfig() {
		super();
	}

	public AppConfig(String key, String value) {
		super();
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
