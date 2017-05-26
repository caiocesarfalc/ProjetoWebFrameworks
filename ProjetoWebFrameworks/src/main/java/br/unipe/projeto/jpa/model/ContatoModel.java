package br.unipe.projeto.jpa.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_contato")
public class ContatoModel implements Serializable{
	
	@Id
	@GeneratedValue
	private int id;	
	@Column(name="nome")
	private String nome;	
	@Column(name="sobrenome")
	private String sobreNome;	
	@Column(name="telefone")
	private String telefone;	
	@Column(name="email")
	private String email;
	
	
	@ManyToOne
	private UsuarioModel usuario;
	
	public UsuarioModel getUsuario() {
		return usuario;
	}
	public void setUsuario(UsuarioModel usuario) {
		this.usuario = usuario;
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
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "ContatoModel [id=" + id + ", nome=" + nome + ", sobreNome=" + sobreNome + ", telefone=" + telefone
				+ ", email=" + email + "]";
	}
	
}
