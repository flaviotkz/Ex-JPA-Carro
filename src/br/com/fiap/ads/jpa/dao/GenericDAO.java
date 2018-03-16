package br.com.fiap.ads.jpa.dao;

public interface GenericDAO<F, G> {

	void create(F entity);

	void update(F entity);

	void delete(G id) throws Exception;

	F read(G id);
	
	void commit();
}
