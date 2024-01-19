package ejemplopersona;

import java.util.Scanner;

public class AppPersona {

	//Class loader. Antes de entrar al main carga el método estático, luego el método main.
	
	static boolean enEjecucion=false; //--> Variables por un lado, no puede estar dentro de la clase.
	private int variableObjeto=0; //La hacemos privada, para que luego en main podamos acceder a ella pero de forma privada
	
	static {
	 enEjecucion = true;
	}
	
	static boolean estaEnEjecucion () {
		return enEjecucion;
	}
	
	public int getvariableObjeto () {
		return variableObjeto;
	}
	
	public void setvariableObjeto (int variableObjeto) {
		this.variableObjeto=variableObjeto;
	}
	
	
	public static void main(String[] args) {
		// Único punto de entrada a nuestra aplicación
		
		//Unica manera de objetos estaticos a obejos de método. Primero los creo y luego acceso.
		AppPersona app = new AppPersona();
		app.variableObjeto=2;
		app.setvariableObjeto(2);
		System.out.println("Personas creadas:" + app.getvariableObjeto());
		
		enEjecucion=true;
	
		System.out.println("Personas creadas:" + Persona.getnumPersonas());
		
		System.out.println("Programa en ejecución:" + AppPersona.enEjecucion);
		
		//Nosotros creamos los parámetros
		Scanner sc = new Scanner(System.in);

		Persona jesus = new Persona("Jesús","Soto",666,2004);
		System.out.println(jesus);
		
		System.out.println("Personas creadas:" + Persona.getnumPersonas());
		
		Persona alumno = new Persona(); //Objeto alumno creado pero sin parámetros, es decir vacío.
		
		//Introducimos los parámetros por consola
		System.out.println("Introduce el nombre:");
		String nombre = sc.nextLine();
		alumno.setnombre(nombre);
		
		System.out.println("Introduce el apellido:");
		alumno.setapellidos(sc.nextLine());
		
		System.out.println("Introduce el ID:");
		alumno.setid(sc.nextLong());
		
		
		System.out.println("Introduce el año de nacimiento:");
		alumno.setanoNacimiento(sc.nextInt());
		
		System.out.println(alumno);
		System.out.println("Personas creadas:" + Persona.getnumPersonas());
	}

}
