package fundamentosorientacionobjetos;

public class ClasePrincipal {

	public static void main(String[] args) {
		//Creamos el primer metodo de la clase object
		//New -> Reserva una zona de memoria, donde se introducen los atributos, métodos. (Fundamentalmente los atributos).
		Coche miCoche = new Coche ();
		String s = new String ("hola");
		String s2 = "hola";
		
		System.out.println(miCoche.toString());
		
		//ATRIBUTOS PUBLICOS NO
		//miCoche.publica="publica";
		
		Coche miTesla = new Coche ("Rojo","Tesla","s");
		
		//Procedimiento que modifica
		miTesla.repintar("Amarillo");
		System.out.println(miTesla);
		
		miTesla.setModelo("S High Performance");		
		System.out.println(miTesla);
		
		miCoche.setMarca("Ford");
		miCoche.setModelo("Mondeo");
		System.out.println(miCoche);
		
		miCoche.setColor(miTesla.getColor());
		
	}

}
