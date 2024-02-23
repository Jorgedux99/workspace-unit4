package iesjandula.unit4project.arraysdeobjetos.agregacion;

public class AppClientes {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Jesús", "Soto", "444444");
		
		Cliente c2 = new Cliente("Pablo", "Martínez", "555555");
		
		Tienda t1 = new Tienda("Software J&P", "C. San Vicente Paul, 32, 23740 Andújar, Jaén");
		
		t1.addCliente(c1);
		
		t1.addCliente(c2);
		
		System.out.println(t1);
		
		t1.addCliente(c2);
		
	}

}
