package br.unipe.projeto.jpa.dao;

import br.unipe.projeto.jpa.model.ContatoModel;

public class ContatoGenericDAO extends GenericDAO<ContatoModel> implements ContatoDAOIF {

  public ContatoGenericDAO(){
	  setEntidade(ContatoModel.class);
  }


}
