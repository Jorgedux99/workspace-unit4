package iesjandula.unit4project.ejercicio49;

public class Departamento {
	   
	   
	   private String nombre;
	   
	   private Municipio[] municipios;
	   
	   
	   public Departamento(String nombre) {
	   
	       this.nombre = nombre;
	       
	   }

	   // hacerlo con objeto MunicipioNulo
	   public Departamento(String nombre, Municipio[] municipios) {
	       this(nombre);
	       
	   }
	   
	   
	   

	}