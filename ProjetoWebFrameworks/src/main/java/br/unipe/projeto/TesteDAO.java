package br.unipe.projeto;

import br.unipe.projeto.jpa.dao.ContatoDAOImpl;
import br.unipe.projeto.jpa.dao.UsuarioDAOImpl;
import br.unipe.projeto.jpa.model.ContatoModel;
import br.unipe.projeto.jpa.model.Perfil;
import br.unipe.projeto.jpa.model.UsuarioModel;

public class TesteDAO {
	
	public static void main(String[] args) {
		
		
		UsuarioDAOImpl usuarioDAO = new UsuarioDAOImpl();
		UsuarioModel usuario = new UsuarioModel();
		usuario.setLogin("eymael");
		usuario.setNome("Eymael");
		usuario.setPerfil(Perfil.ADM.getCdPerfil());
		usuario.setSenha("12345");
		usuarioDAO.incluir(usuario);
		
		ContatoDAOImpl contatoDAO = new ContatoDAOImpl();
		ContatoModel contato = new ContatoModel();
		contato.setEmail("rodrigofujioka@gmail.com");
		contato.setNome("Rodrigo");
		contato.setSobreNome("Fujioka");
		contato.setTelefone("55 83 988889999");
		contato.setUsuario(usuario);
		contatoDAO.incluir(contato);
							
	}

}
