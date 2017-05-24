package br.unipe.projeto.jpa.dao;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;

import br.unipe.projeto.jpa.factory.JPAUtil;

public abstract class GenericDAO<T extends Serializable> {

	private Class<T> entidade;

	// @PersistenceContext <- Quando estiver utilizando o Spring para Injetar
	// EntityManager entityManager;

	public final void setEntidade(Class<T> clazzToSet) {
		this.entidade = clazzToSet;
	}

	public T consultar(long id) {
		EntityManager entityManager = JPAUtil.getEntityManager();
		return entityManager.find(entidade, id);
	}

	@SuppressWarnings("unchecked")
	public List<T> listar() {
		List<T> listaRetorno = Collections.emptyList();
		EntityManager entityManager = JPAUtil.getEntityManager();

		try {

			listaRetorno = entityManager.createQuery(
					"from " + entidade.getName()).getResultList();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
		return listaRetorno;
	}

	public void incluir(T entity) {
		EntityManager entityManager = JPAUtil.getEntityManager();
		try {
			entityManager.persist(entity);
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			entityManager.close();
		}
	}

	public void atualizar(T entity) {
		EntityManager entityManager = JPAUtil.getEntityManager();
		try {
			entityManager.merge(entity);
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			entityManager.close();
		}		
	}

	public void remover(T entity) {
		EntityManager entityManager = JPAUtil.getEntityManager();
		try {
			entityManager.remove(entity);
		} catch (Exception e) {
			e.printStackTrace();
			;
		} finally {
			entityManager.close();
		}
	}

	/**
	 * Realiza exclus�o de registro utilizando o ID da entidade como par�metro
	 * 
	 * @param entityId
	 *            contendo o id a ser utilizado.
	 */
	public void removerPorId(long entityId) {
		EntityManager entityManager = JPAUtil.getEntityManager();

		try {
			T entity = consultar(entityId);
			remover(entity);
		} catch (Exception e) {
			e.printStackTrace();
			;
		} finally {
			entityManager.close();
		}

	}
}
