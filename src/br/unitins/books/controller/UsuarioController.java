package br.unitins.books.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;


@Named
@ViewScoped
public class UsuarioController implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6735972047454490532L;
	
	private Usuario usuario;
	
	private List<Usuario> listaUsuario;
	
	public void editar(Usuario user) {
		setUsuario(user);
	}
	
	public void incluir() {
		getListaUsuario().add(getUsuario());
		limpar();
	}
	
	public void alterar() {
		System.out.println(getUsuario().getNome());
	}
	public void remover() {
	getListaUsuario().remove(getUsuario());
	limpar();
	}
	public void limpar() {
		usuario = null;
	}

	public Usuario getUsuario() {
		if (usuario == null) {
			usuario = new Usuario();
		}
		
		
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
		
	}
	

	public List<Usuario> getListaUsuario() {
		if (listaUsuario == null) {
			listaUsuario = new  ArrayList<Usuario>();
		}
		
		return listaUsuario;
	}

	public void setListaUsuario(List<Usuario> listaUsuario) {
		this.listaUsuario = listaUsuario;
	}
	
	
	
	
}
