package com.devsuperior.dslearnbds.resources.exceptions;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OAuthCustomError implements Serializable {
	
	private static final long serialVersionUID =1L; 

	private String error;
	
	@JsonProperty("error_description")
	private String errorDescrption;
	
	public OAuthCustomError() {
		
	}
	
	public OAuthCustomError(String error, String errorDescrption) {
		this.error = error;
		this.errorDescrption = errorDescrption;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getErrorDescrption() {
		return errorDescrption;
	}

	public void setErrorDescrption(String errorDescrption) {
		this.errorDescrption = errorDescrption;
	}
	
	
}

