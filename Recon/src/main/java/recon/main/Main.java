package recon.main;

import recon.dao.ReceitaDAO;
import recon.model.Receita;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	
	public static void main(String[] args) {
		
		 Receita r = new Receita();
		 r.setNome("Pudim de leite");
		 r.setDificuldade("fácil");
		 r.setNota(10);
		 r.setLink("https://www.tudogostoso.com.br/receita/31593-pudim-de-leite-condensado.html");
				

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bancodadosPU");
				
		EntityManager em = emf.createEntityManager();
								
		ReceitaDAO.create(r);
		ReceitaDAO.retrieve(1);
		ReceitaDAO.update(r);
		ReceitaDAO.delete(r);
				em.getTransaction().begin();
				
				//em.persist(r);
				//em.merger(r);
				//em.remove(r);
				em.getTransaction().commit();
				
				em.close();
				emf.close();			
	}
	
}
