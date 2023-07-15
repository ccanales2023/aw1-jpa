package clase3.entidades;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class MarcaDao {
	public Marca save(Marca marca) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("farmaciadb");
		EntityManager entityManager = entityManagerFactory.createEntityManager();	// CRUD

		entityManager.getTransaction().begin();
		entityManager.persist(marca);
		entityManager.getTransaction().commit();
		entityManager.close();

		return marca;

	}

	

	public void delete(Marca marca) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("farmaciadb");
		EntityManager entityManager = entityManagerFactory.createEntityManager();	// CRUD


		entityManager.getTransaction().begin();
		entityManager.remove(marca);
		entityManager.getTransaction().commit();

	}
	public List<Marca> findAll(){
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("farmaciadb");
		EntityManager entityManager = entityManagerFactory.createEntityManager();	// CRUD
		
		TypedQuery<Marca>  query = entityManager.createQuery("select m from Marca m", Marca.class);
		return query.getResultList();
	}
	

	public Marca findById(Long id) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("farmaciadb");
		EntityManager entityManager = entityManagerFactory.createEntityManager();	// CRUD

		return entityManager.find(Marca.class, id);

	}

}
