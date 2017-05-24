package br.unipe.projeto;

import br.unipe.projeto.jpa.dao.ContatoDAOImpl;
import br.unipe.projeto.jpa.model.ContatoModel;

public class TesteDAO {
	
	public static void main(String[] args) {
		
		
		ContatoDAOImpl dao = new ContatoDAOImpl();
		ContatoModel contato = new ContatoModel();
		contato.setEmail("rodrigofujioka@gmail.com");
		contato.setNome("Rodrigo");
		contato.setSobreNome("Fujioka");
		contato.setTelefone("55 83 988889999");
		dao.incluir(contato);
							
	}

}
