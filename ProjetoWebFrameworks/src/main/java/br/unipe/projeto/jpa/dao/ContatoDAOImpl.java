package br.unipe.projeto.jpa.dao;

import java.io.Serializable;

import javax.persistence.EntityManager;

import br.unipe.projeto.jpa.factory.JPAUtil;
import br.unipe.projeto.jpa.model.ContatoModel;

public class ContatoDAOImpl {
	
	public void incluir(ContatoModel contato) {
		EntityManager manager = JPAUtil.getEntityManager();
		manager.getTransaction().begin();
		manager.persist(contato);
		manager.getTransaction().commit();
		manager.close();
		
	}
	
	public void remover(ContatoModel contato) {
		EntityManager manager = JPAUtil.getEntityManager();
		manager.getTransaction().begin();
		manager.remove(contato);
		manager.getTransaction().commit();
		manager.close();
	}

	public void alterar(ContatoModel contato) {
		EntityManager manager = JPAUtil.getEntityManager();
		manager.getTransaction().begin();
		manager.persist(contato);
		manager.getTransaction().commit();
		manager.close();
	}

	public ContatoModel consultar(ContatoModel contato) {
		EntityManager manager = JPAUtil.getEntityManager();		
		contato = manager.find(ContatoModel.class, contato.getId() );		
		manager.close();
		
		return contato;
		
	}
	
	public ContatoModel consultar(Serializable identificador) {
		EntityManager manager = JPAUtil.getEntityManager();		
		ContatoModel contato = manager.find(ContatoModel.class, identificador );		
		manager.close();		
		return contato;		
	}

	public void listar() {

	}

}
