package br.com.fiap.ads.daoimpl;

import javax.persistence.EntityManager;

import br.com.fiap.ads.entity.Motorista;
import br.com.fiap.ads.jpa.dao.MotoristaDAO;

public class MotoristaDAOImpl extends GenericDAOImpl<Motorista, Integer> implements MotoristaDAO {

	public MotoristaDAOImpl(EntityManager em) {
		super(em);
	}

}
