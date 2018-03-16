package br.com.fiap.ads.daoimpl;

import javax.persistence.EntityManager;

import br.com.fiap.ads.entity.Pagamento;
import br.com.fiap.ads.jpa.dao.PagamentoDAO;

public class PagamentoDAOImpl extends GenericDAOImpl<Pagamento, Integer> implements PagamentoDAO {

	public PagamentoDAOImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

}
