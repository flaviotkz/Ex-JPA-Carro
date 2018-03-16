package br.com.fiap.ads.daoimpl;

import javax.persistence.EntityManager;

import br.com.fiap.ads.entity.Veiculo;
import br.com.fiap.ads.jpa.dao.VeiculoDAO;

public class VeiculoDAOImpl extends GenericDAOImpl <Veiculo,Integer> implements VeiculoDAO {

public VeiculoDAOImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

}
