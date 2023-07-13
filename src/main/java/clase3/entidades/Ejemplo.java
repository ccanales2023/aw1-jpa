package clase3.entidades;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Ejemplo {
	
	public static void main (String[] args) {
//		Persona persona = new Persona();
//	    persona.numeroDocumento = "73646447";
///		persona.tipoDocumento = TipoDocumento.DNI;
//		persona.nombre = "Arthur";
//		persona.apellido = "Mauricio";
	



//		PersonaDao personaDao = new PersonaDao();
//		personaDao.save(persona);

//		System.out.println("Se guardo en la BD");
		
		ProductoDao productoDao = new ProductoDao();
		MarcaDao marcaDao = new MarcaDao();
		
		Marca panadol = new Marca();
		panadol.nombre = "Panadol";
		Marca panadolConId = marcaDao.save(panadol);
		
		Producto producto = new Producto();
		producto.nombre = "Paracetamol";
		producto.precio  = new BigDecimal(3.0);
		producto.stock = 50;
		producto.marca = panadolConId;
		productoDao.save(producto);
		
		
	}

}
