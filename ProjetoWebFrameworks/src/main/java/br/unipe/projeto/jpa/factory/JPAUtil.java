package br.unipe.projeto.jpa.factory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	private static EntityManagerFactory factory;
	private static String PERSISTENCE_UNIT_NAME = "unipewf";
	
	private JPAUtil(){
		
	}
	
	public static EntityManagerFactory getEntityManagerFactory(){
		if(factory==null)
			factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		return factory;
	}

	public static EntityManager getEntityManager(){
		
		EntityManager entityManager = getEntityManagerFactory().createEntityManager();
		return entityManager;			
	}
	

}
