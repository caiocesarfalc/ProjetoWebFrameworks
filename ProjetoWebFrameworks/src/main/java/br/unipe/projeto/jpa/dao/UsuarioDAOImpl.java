package br.unipe.projeto.jpa.dao;

import java.io.Serializable;

import javax.persistence.EntityManager;

import br.unipe.projeto.jpa.factory.JPAUtil;
import br.unipe.projeto.jpa.model.UsuarioModel;

public class UsuarioDAOImpl {
	
	public void incluir(UsuarioModel usuario) {
		EntityManager manager = JPAUtil.getEntityManager();
		manager.getTransaction().begin();
		manager.persist(usuario);
		manager.getTransaction().commit();
		manager.close();
		
	}
	
	public void remover(UsuarioModel usuario) {
		EntityManager manager = JPAUtil.getEntityManager();
		manager.getTransaction().begin();
		manager.remove(usuario);
		manager.getTransaction().commit();
		manager.close();
	}

	public void alterar(UsuarioModel usuario) {
		EntityManager manager = JPAUtil.getEntityManager();
		manager.getTransaction().begin();
		manager.persist(usuario);
		manager.getTransaction().commit();
		manager.close();
	}

	public UsuarioModel consultar(UsuarioModel usuario) {
		EntityManager manager = JPAUtil.getEntityManager();		
		usuario = manager.find(UsuarioModel.class, usuario.getId() );		
		manager.close();
		
		return usuario;
		
	}
	
	public UsuarioModel consultar(Serializable identificador) {
		EntityManager manager = JPAUtil.getEntityManager();		
		UsuarioModel usuario = manager.find(UsuarioModel.class, identificador );		
		manager.close();		
		return usuario;		
	}

	public void listar() {

	}

}
