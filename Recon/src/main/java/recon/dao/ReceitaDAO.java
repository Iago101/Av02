package recon.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import recon.model.Receita;

public class ReceitaDAO {


	public static Receita create(Receita r) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bancodadosPU");
		 EntityManager entityManager = emf.createEntityManager();

		 entityManager.getTransaction().begin();
		 entityManager.persist(r);
		 entityManager.getTransaction().commit();
		 entityManager.close();
	}


	public static Receita retrieve(Integer id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bancodadosPU");
		 EntityManager entityManager = emf.createEntityManager();

		 entityManager.getTransaction().begin();
		 Receita r = entityManager.find(Receita.class, id);
		 System.out.println(r.getNome());

		 entityManager.getTransaction().commit();
		 entityManager.close();

	}
	
	public static Receita update(Receita r) {
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("bancodadosPU");
		 EntityManager entityManager = emf.createEntityManager();

		 entityManager.getTransaction().begin();
		 r.setNome("Pudim de Leite Condensado");

		 entityManager.getTransaction().merge(r);
		 entityManager.getTransaction().commit();
		 entityManager.close();

	}

	public static void delete(Receita r) {
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("bancodadosPU");
		 EntityManager entityManager = emf.createEntityManager();
		 		 
		 entityManager.getTransaction().begin();
		 entityManager.remove(r);
		 entityManager.getTransaction().commit();
		 entityManager.close();
	}
}