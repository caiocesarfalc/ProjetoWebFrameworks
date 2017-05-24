package br.unipe.projeto.jpa.dao.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.unipe.projeto.jpa.model.ContatoModel;

@Repository
public interface ContatoJPACrudRepository extends JpaRepository<ContatoModel, Integer>{

}
