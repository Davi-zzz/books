package br.unitins.books.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.unitins.books.controller.Usuario;

//fazer alterar e pesquisar classe cloneable e implementar no projeto

@Named
@ViewScoped
public class UsuarioController implements Serializable{

	

	/**
	 * 
	 */
	private static final long serialVersionUID = -6849723378232741964L;
	
	private Usuario usuario;
	private List<Usuario> listaUsuario;
	
	public void incluir() {
		getListaUsuario().add(getUsuario());
		limpar();
	}
	
	public void excluir() {
		getListaUsuario().remove(getUsuario());
	}
	

	public void editar(Usuario usu) {
//		Usuario usuNovo = new Usuario();
//		usuNovo.setId(usu.getId());
//		usuNovo.setNome(usu.getNome());
		
		setUsuario(usu);
	}
	

	public void limpar() {
		usuario = null;
	}

	public List<Usuario> getListaUsuario() {
		if (listaUsuario == null)
			listaUsuario = new ArrayList<Usuario>();
		return listaUsuario;
	}

	public void setListaUsuario(List<Usuario> listaUsuario) {
		this.listaUsuario = listaUsuario;
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
	
	
}
