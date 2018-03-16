package br.com.fiap.ads.daoimpl;

import javax.persistence.EntityManager;

import br.com.fiap.ads.entity.Corrida;
import br.com.fiap.ads.jpa.dao.CorridaDAO;

public class CorridaDAOImpl extends GenericDAOImpl<Corrida, Integer> implements CorridaDAO {

	public CorridaDAOImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

}
