package br.unipe.projeto.jpa.dao;

import java.util.List;

import br.unipe.projeto.jpa.model.UsuarioModel;

public interface UsuarioDAOIF {

	public UsuarioModel consultar(long id) ;
	public List<UsuarioModel> listar() ;
	public void incluir(UsuarioModel entity) ;
	public void atualizar(UsuarioModel entity) ;
	public void remover(UsuarioModel entity) ;
	public void removerPorId(long entityId) ;
}
