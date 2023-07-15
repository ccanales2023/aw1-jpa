package clase3.entidades;

import java.math.BigDecimal;
import java.util.Arrays;

public class EjemploImagenes {
	
	
	
	public static void main(String[] args) {
		ProductoDao productoDao = new ProductoDao();
				
		Producto clonazepam = new  Producto();
		clonazepam.nombre = "Clonazepam";
		clonazepam.precio = new BigDecimal(5.0);
		clonazepam.stock = 20;
		clonazepam.imagenes = Arrays.asList(
				"https://eltiempomx.com/cdn-cgi/image/format=auto,width=730/monclova/2023/01/63d974c551a6c.jpg",
				"https://www.farmalisto.com.pe/18279-large_default/clonazepam-2-mg-por-100-tabletas.jpg");
		
		productoDao.save(clonazepam);
		System.out.println("Producto Registrado");
		
	}

}
