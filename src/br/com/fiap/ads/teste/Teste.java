package br.com.fiap.ads.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.ads.daoimpl.VeiculoDAOImpl;
import br.com.fiap.ads.entity.Motorista;
import br.com.fiap.ads.entity.Veiculo;
import br.com.fiap.ads.jpa.dao.VeiculoDAO;
import br.com.fiap.ads.jpa.singleton.EntityManagerFactorySingleton;

public class Teste {
	public static void main(String[] args) {
		EntityManagerFactory fabrica = EntityManagerFactorySingleton.getInstance();
		
		EntityManager em = fabrica.createEntityManager();
		
		
	//cadastrar
		Veiculo v = new Veiculo("ASD-1234", "Prata", 2010);
		VeiculoDAO dao = new VeiculoDAOImpl(em);
		
		try {
			dao.create(v);
			dao.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	//buscar
		Veiculo vBusca = dao.read(v.getCodigo());
		System.out.println(vBusca.getPlaca());
		
	//atualizar
		vBusca.setPlaca("AAA-1212");
		try {
		dao.update(vBusca);
		dao.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try {
			dao.delete(vBusca.getCodigo());
			dao.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
