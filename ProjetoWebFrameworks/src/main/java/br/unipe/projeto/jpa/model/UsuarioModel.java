package br.unipe.projeto.jpa.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_usuario")
public class UsuarioModel implements Serializable{
	
	@Id
	@GeneratedValue
	private int id;	
	@Column(name="nome")
	private String nome;	
	@Column(name="login")
	private String login;
	@Column(name="senha")
	private String senha;
	//TODO transformar perfil em enum
	@Column(name="perfil")
	private int perfil;
	
	@OneToMany
	private Set<ContatoModel> contatos;
	
	public Set<ContatoModel> getContatos() {
		return contatos;
	}

	public void setContatos(Set<ContatoModel> contatos) {
		this.contatos = contatos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	public int getPerfil() {
		return perfil;
	}

	public void setPerfil(int perfil) {
		this.perfil = perfil;
	}

	@Override
	public String toString() {
		return "UsuarioModel [id=" + id + ", nome=" + nome + ", login=" + login + ", senha=" + senha + "]";
	}
	
}
