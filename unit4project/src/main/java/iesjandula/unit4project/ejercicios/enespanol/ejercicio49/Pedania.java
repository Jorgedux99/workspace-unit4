package iesjandula.unit4project.ejercicios.enespanol.ejercicio49;

public class Pedania extends Municipio implements IAlcalde {

	private Villa villa;
	
	public Pedania(String nombre, int poblacion, double temperatura, double altitud, Villa villa) {
		super(nombre, poblacion, temperatura, altitud, villa.getAlcalde());
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean esPedania() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		return "Pedania [villa=" + villa + ", Nombre=" + getNombre() + ", Poblacion=" + getPoblacion()
				+ ", Temperatura=" + getTemperatura() + ", Altitud=" + getAltitud() + ", Alcalde="
				+ getAlcalde() + "]";
	}

	@Override
	public String infoAlcalde() {
		
		return villa.getAlcalde().infoAlcalde();
	}


	
	
}
