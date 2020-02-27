package br.unitins.books.controller;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named("LoginController")
@RequestScoped

public class LoginController {
	private  String Login;
	private String Senha;
	
	public String entrar() {
		if(Login.equals("DAVI") && Senha.equals("123123")) {
			///REDIRECIONAR
			return "helloword.xhtml?faces-redirect=true\""; 
		}
		//SE DER ERRADO
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage
				(FacesMessage.SEVERITY_ERROR,"Login ou senha inválido", null));
		return null;
	}
	public void limpar() {
		Login="";
		Senha="";
	}
	
	public String getLogin() {
		return Login;
	}
	public void setLogin(String login1) {
		Login = login1;
	}
	public String getSenha() {
		return Senha;
	}
	public void setSenha(String senha1) {
		Senha = senha1;
	}
	
}

