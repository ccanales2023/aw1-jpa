package clase3.entidades;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Marca {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	String nombre;
	String logo;

	//var nike = new Marca();
	//nike.nombre ="Nike"
	//nike.logo ="";
	//nike.productos??
	
	//select p from Productos p where p.marca = nike and p.stock > 100;
	//...
	
	//@OneToMany
	//List<Producto> productos;
}
