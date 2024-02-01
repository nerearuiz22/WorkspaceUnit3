package fundamentosorientacionobjetos;

public class ClasePrincipal {

	public static void main(String[] args) {
		//Creamos el primer metodo de la clase object
		//New -> Reserva una zona de memoria, donde se introducen los atributos, métodos. (Fundamentalmente los atributos).
		Coche miCoche = new SUV ("Rojo","Kord","Mondeo",25000,15000);
		String s = new String ("hola");
		String s2 = "hola";
		
		System.out.println(miCoche.toString());
		
		//ATRIBUTOS PUBLICOS NO
		//miCoche.publica="publica";
		
		Coche miTesla = new Sedan ("Rojo","Tesla","s",25000,15000,5);
		
		//Procedimiento que modifica
		miTesla.repintar("Amarillo");
		System.out.println(miTesla);
		
		miTesla.setModelo("S High Performance");		
		System.out.println(miTesla);
		
		miCoche.setMarca("Ford");
		miCoche.setModelo("Mondeo");
		System.out.println(miCoche);
		
		miCoche.setColor(miTesla.getColor());
		
		miCoche.beneficios(0.18);
		
		System.out.println("Beneficios:" + miTesla.beneficios(0.18));
		
		SUV miTeslaSUV = new SUV ("Azul","Tesla","Model E",35000,30000);
		System.out.println("Mi SUV:" + miTeslaSUV);
		
	}

}
