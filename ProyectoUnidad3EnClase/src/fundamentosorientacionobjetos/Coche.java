package fundamentosorientacionobjetos;

public abstract class Coche {

	//Atributos del objeto, siempre en privado
	
	public static int numCoches=0; //Static --> Precargado en memoria
	private String color;
	private String marca;
	private String modelo;
	private double precio;
	private double coste;
	//Atributo de clase, todas las clases comparten ese método.
	
	//MAL HECHO ATRIBUTOS PÚBLICOS NO 
	//public String publica;
	
	//Constructores -> Único método que no tiene tiempo de retorno porque esta implicito, se encarga de crear una instancia.
	public Coche() {
		color="Blanco";
		numCoches++;
		System.out.println("Número de coches creados: " + Coche.numCoches);
	}
	
    public Coche(String color, String marca, String modelo, double precio, double coste) {
    	//THIS --> Acceder a la referencia a mi mismo. Parecido a una variable objeto.
    	//color = "Blanco" otra manera 
    	
		//PARA EVITAR REPETIR numCoches++;
    	this();

        //****************************************
         
		this.color = color;
		this.marca=marca;
		this.modelo=modelo;
		this.precio=precio;
		this.coste=coste;
		System.out.println("Número de coches creados: " + Coche.numCoches);
	}
    
    //MÉTODOS ABSTRACTOS DESPUÉS DE LOS CONSTRUCTORES
    public abstract String getTipoCoche();
    
    //Propiedades estáticas que todas las clases comparten. Se accede con el nombre de la clase
    public static int numCoches ()  {
    	return numCoches;
    }
    
    //Procedimiento de modificador público
    //Interfaz, herramienta de comuncicación al mundo exterior -> Métodos públicos
    
   //*************************************** 
   
    //Métodos de acceso GET Y SET Para acceder a las variables
    
    
    public String getColor() {
    	return color;
    }
    
    public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getCoste() {
		return coste;
	}

	public void setCoste(double coste) {
		this.coste = coste;
	}

	//Método de procedimiento, para cambiar el color, el que añade funcionalidad.
    public void setColor(String color) {
    	this.color=color;
    }
    
    public String getMarca() {
    	return marca;
    }
    
    public void setMarca(String marca) {
    	this.marca=marca;
    }
    
    public String getModelo() {
    	return modelo;
    }
    
    public void setModelo(String modelo) {
    	this.modelo=modelo;
    }
    
    //****************************************
    //MÉTODOS FUNCIONALES
    
    public double beneficios(double iva) {
    	return (precio-coste) -impuestos(iva);
    	}
    
    //IVA decimal entre 0  y 1
    	private double impuestos( double iva) {
    	return (precio-coste)* iva;
    	}
     
    public void repintar (String color) {
    	this.color=color;
    }

	@Override
	public String toString() {
		return "Coche [color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", coste="
				+ coste + "]";
	}

	
}
