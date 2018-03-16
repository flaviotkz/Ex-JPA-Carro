package br.com.fiap.ads.daoimpl;

import javax.persistence.EntityManager;

import br.com.fiap.ads.entity.Passageiro;
import br.com.fiap.ads.jpa.dao.PassageiroDAO;

public class PassageiroDAOImpl extends GenericDAOImpl<Passageiro, Integer> implements PassageiroDAO {

	public PassageiroDAOImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

}
