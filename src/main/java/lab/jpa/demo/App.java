package lab.jpa.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import lab.jpa.demo.entity.Author;

public class App {
	
	public static void main(String[] args) {
		System.out.println("START");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnitName");
		EntityManager em = factory.createEntityManager();
		
		Author a1 = new Author(111, "Ram" , "Kumar", "Das", 9876545789L);
		Author a2 = new Author(112, "Pam" , "Kumar", "Das", 9876545789L);
		Author a3 = new Author(113, "Sam" , "Singh", "Das", 9876545453L);
		Author a4 = new Author(114, "Tam" , "Kumar", "Sinha", 9876556789L);
		Author a5 = new Author(115, "Dam" , "Kumar", "Sinha", 6542425809L);
		
//		Author a1 = new Author("Ram" , "Kumar", "Das", 9876545789L);
//		Author a2 = new Author("Pam" , "Kumar", "Das", 9876545789L);
//		Author a3 = new Author("Sam" , "Singh", "Das", 9876545453L);
//		Author a4 = new Author("Tam" , "Kumar", "Sinha", 9876556789L);
//		Author a5 = new Author("Dam" , "Kumar", "Sinha", 6542425809L);
//		
		em.getTransaction().begin();
		
//		em.persist(a1); // insert
//		em.persist(a2); // insert
//		em.persist(a3); // insert
//		em.persist(a4); // insert
//		em.persist(a5); // insert
		
//		em.remove(a1);
		
		a2.setLastName("Jha");
		em.merge(a2); // update
		
		Author author_details = em.find(Author.class, 112); // select
		
		
		em.getTransaction().commit();
		
		System.out.println(author_details.toString());

		
		System.out.println("End");
		
		
	}

}
