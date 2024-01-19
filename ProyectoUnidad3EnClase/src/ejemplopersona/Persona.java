package ejemplopersona;

public class Persona {
	
	//ORDEN:
	/**
	 * Atributos
	 * Métodos de incialización
	 * Métodos constructores
	 * Métodos estáticos
	 * Metodos de acceso
	 * Métodos de funcionalidad
	 * 
	 */

	//Atributos, siempre en privado
		private String nombre;
		private String apellidos;
		private long id;
		private int anoNacimiento;
		private static int numPersonas;
		
		//Código de inicialización, sólo puedes introducir valores estáticos
		static {
			numPersonas=0;
		}
		
		//Constructor que inicia los valores con sus respectivos atributos
		public Persona() {
			
		}
		
		public Persona (String nombre, String apellidos, long id, int anoNacimiento) {
			this.nombre=nombre;
			this.apellidos=apellidos;
			this.id=id;
			this.anoNacimiento=anoNacimiento;
			numPersonas++;
		}
		
		//Método estático o de clase -> Para el contador solo get, para que nadie lo modifique
		public static int getnumPersonas() {
		    	return numPersonas;
		    }
		
		//LOS SET Y LOS GET -> Métodos de acceso
		public void setnombre(String nombre) {
	    	this.nombre=nombre;
	    }
	    
	    public String getnombre() {
	    	return nombre;
	    }
	    
	    public void setapellidos(String apellidos) {
	    	this.apellidos=apellidos;
	    }
	    
	    public String getapellido() {
	    	return apellidos;
	    }
	    
	    public long getid() {
	    	return id;
	    }
	    
	    public void setid(long id) {
	    	this.id=id;
	    }
	    
	    public void setanoNacimiento(int anoNacimiento) {
	    	this.anoNacimiento=anoNacimiento;
	    }
	    
	    public int getanoNacimiento() {
	    	return anoNacimiento;
	    }
	    
	    //Método de funcionalidad
	    public int calcularEdad (int anoActual) {
	    	return anoActual-anoNacimiento; //Sacamos la edad del objeto persona
	    }
	    
	  //Método de funcionalidad
	    @Override  //----->Puede haber varios, override + método, override + método 
	    public String toString() {
	    	return "Persona [Nombre=" + nombre + ", Apellidos=" + apellidos + ", Id=" + id + ", Año de nacimiento=" + anoNacimiento + "]";
	    }
	    
	}

