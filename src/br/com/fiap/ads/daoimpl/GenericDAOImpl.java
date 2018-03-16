package br.com.fiap.ads.daoimpl;

import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;

import br.com.fiap.ads.jpa.dao.GenericDAO;

public class GenericDAOImpl<F, G> implements GenericDAO<F, G> {

	private EntityManager em;

	private Class<F> clazz;

	@SuppressWarnings("unchecked")
	public GenericDAOImpl(EntityManager em) {
		this.em = em;
		clazz = (Class<F>) ((ParameterizedType) 
			getClass().getGenericSuperclass())
						.getActualTypeArguments()[0];
	}
	@Override
	public void create(F entity) {
		em.persist(entity);

	}

	@Override
	public void update(F entity) {
		em.merge(entity);
	}

	@Override
	public void delete(G id) throws Exception {
		F entity = read(id);
		if (entity == null) {
			throw new Exception();
		}
		em.remove(entity);
	}

	@Override
	public F read(G id) {
		return em.find(clazz, id);
	}

	public void commit() {
		try {
		em.getTransaction().begin();
		em.getTransaction().commit();
		} catch (Exception e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			e.printStackTrace();
		}
	}

}
