package br.com.engmanager.api.login.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ChangePasswordDto  {
	

	@SerializedName("newPassword")
	@JsonProperty("newPassword")	
	private String newPassword;

	public ChangePasswordDto(String pwd) {
		this.newPassword = pwd;
	}
	public ChangePasswordDto() {}
	
	
	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	


}
