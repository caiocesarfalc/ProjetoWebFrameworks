package br.unipe.projeto.jpa.dao;

import br.unipe.projeto.jpa.model.UsuarioModel;

public class UsuarioGenericDAO extends GenericDAO<UsuarioModel> implements UsuarioDAOIF {

  public UsuarioGenericDAO(){
	  setEntidade(UsuarioModel.class);
  }


}
