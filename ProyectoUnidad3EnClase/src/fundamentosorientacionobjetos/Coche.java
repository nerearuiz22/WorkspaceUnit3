package fundamentosorientacionobjetos;

public class Coche {

	//Atributos del objeto, siempre en privado
	
	private String color;
	private String marca;
	private String modelo;
	//Atributo de clase, todas las clases comparten ese método.
	public static int numCoches=0; //Static --> Precargado en memoria
	
	//MAL HECHO ATRIBUTOS PÚBLICOS NO 
	//public String publica;
	
	//Constructores -> Único método que no tiene tiempo de retorno porque esta implicito, se encarga de crear una instancia.
	public Coche() {
		color="Blanco";
		numCoches++;
		System.out.println("Número de coches creados: " + Coche.numCoches);
	}
	
    public Coche(String color, String marca, String modelo) {
    	//THIS --> Acceder a la referencia a mi mismo. Parecido a una variable objeto.
    	//color = "Blanco" otra manera 
    	
		this.color = color;
		this.marca=marca;
		this.modelo=modelo;
		numCoches++;
		System.out.println("Número de coches creados: " + Coche.numCoches);
	}
    
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
     
    public void repintar (String color) {
    	this.color=color;
    }
    
    @Override //Etiqueta para sobre-escribir ("Sobre-monta")
    public String toString() {
    	return "Coche [color=" + color + ", marca=" + this.marca + ", modelo=" + modelo + "]";
    }
	
}
