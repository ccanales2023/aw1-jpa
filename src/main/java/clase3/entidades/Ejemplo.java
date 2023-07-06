package clase3.entidades;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Ejemplo {
	
	public static void main (String[] args) {
		Persona persona = new Persona();
		persona.numeroDocumento = "73646447";
		persona.tipoDocumento = TipoDocumento.DNI;
		persona.nombre = "Arthur";
		persona.apellido = "Mauricio";
	



		PersonaDao personaDao = new PersonaDao();
		personaDao.save(persona);

		System.out.println("Se guardo en la BD");
		
		
	}

}
