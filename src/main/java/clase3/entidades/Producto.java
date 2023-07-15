package clase3.entidades;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


@Entity
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	
	String nombre;
	String descripcion;
	BigDecimal precio;
	Integer stock;
	

	@ElementCollection
	@Column (name = "url")
	List<String> imagenes = new ArrayList<String>();

	
	//MARCA_ID INTEGER HACIA AL MARCA
	//JoinColumn
	@ManyToOne(optional = true)
	Marca marca;
	
	@CreationTimestamp
	 LocalDateTime fechaCreacion;
	
	@UpdateTimestamp
	 LocalDateTime fechaActualizacion;


}
