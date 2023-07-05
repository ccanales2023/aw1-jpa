package clase3.entidades;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class PersonaDao {

	public Persona save(Persona persona) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("farmaciadb");
		EntityManager entityManager = entityManagerFactory.createEntityManager();	// CRUD

		entityManager.getTransaction().begin();
		entityManager.persist(persona);
		entityManager.getTransaction().commit();

		return persona;

	}

	

	public void delete(Persona persona) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("farmaciadb");
		EntityManager entityManager = entityManagerFactory.createEntityManager();	// CRUD


		entityManager.getTransaction().begin();
		entityManager.remove(persona);
		entityManager.getTransaction().commit();

	}
	public List<Persona> findAll(){
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("farmaciadb");
		EntityManager entityManager = entityManagerFactory.createEntityManager();	// CRUD
		
		TypedQuery<Persona>  query = entityManager.createQuery("select p from Persona p", Persona.class);
		return query.getResultList();
	}
	

	public Persona findById(Long id) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("farmaciadb");
		EntityManager entityManager = entityManagerFactory.createEntityManager();	// CRUD

		return entityManager.find(Persona.class, id);

	}

}