package edu.mum.composition.bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named("image")
@SessionScoped
public class Image implements Serializable {
	private static final long serialVersionUID = 1L;

	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String registerAction() {
		return "welcome?faces-redirect=true";
	}
}
