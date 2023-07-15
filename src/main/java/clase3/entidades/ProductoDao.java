package clase3.entidades;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class ProductoDao {

  
	public Producto save(Producto producto) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("farmaciadb");
		EntityManager entityManager = entityManagerFactory.createEntityManager();	// CRUD

		entityManager.getTransaction().begin();
		entityManager.persist(producto);
		entityManager.getTransaction().commit();
		return producto;

	}

	

	public void delete(Producto producto) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("farmaciadb");
		EntityManager entityManager = entityManagerFactory.createEntityManager();	// CRUD


		entityManager.getTransaction().begin();
		entityManager.remove(producto);
		entityManager.getTransaction().commit();

	}
	public List<Producto> findAll(){
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("farmaciadb");
		EntityManager entityManager = entityManagerFactory.createEntityManager();	// CRUD
		
		TypedQuery<Producto>  query = entityManager.createQuery("select p from Producto p", Producto.class);
		return query.getResultList();
	}
	

	public Producto findById(Long id) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("farmaciadb");
		EntityManager entityManager = entityManagerFactory.createEntityManager();	// CRUD

		return entityManager.find(Producto.class, id);

	}

}
