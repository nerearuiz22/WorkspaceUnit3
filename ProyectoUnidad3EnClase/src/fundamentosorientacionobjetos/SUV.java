package fundamentosorientacionobjetos;

     public class SUV extends Coche{
    	 
    	 private static final String TYPE_SUV="SUV";
    	 
     public SUV(String color, String marca, String modelo, double precio, double coste) {
            super(color, marca, modelo, precio, coste);
       }
     
 	public String getTipoCoche() {
		return TYPE_SUV;
	}

	@Override
	public String toString() {
		return "SUV [getColor()=" + getColor() + ", getPrecio()=" + getPrecio() + ", getCoste()=" + getCoste()
				+ ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo() + "]";
	}

     
     
}