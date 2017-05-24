package br.unipe.projeto.jpa.dao;

import java.util.List;

import br.unipe.projeto.jpa.model.ContatoModel;

public interface ContatoDAOIF {

	public ContatoModel consultar(long id) ;
	public List<ContatoModel> listar() ;
	public void incluir(ContatoModel entity) ;
	public void atualizar(ContatoModel entity) ;
	public void remover(ContatoModel entity) ;
	public void removerPorId(long entityId) ;
}
