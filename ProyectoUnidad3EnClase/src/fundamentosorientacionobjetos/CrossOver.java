package fundamentosorientacionobjetos;

public class CrossOver extends Coche {
	
  	 private static final String TYPE_CO="CrossOver";

	  public CrossOver(String color, String marca, String modelo, double precio, double coste) {
	    super();
		}

		public String getTipoCoche() {
			return TYPE_CO;
		}
	  
	@Override
	public String toString() {
		return "CrossOver [getColor()=" + getColor() + ", getPrecio()=" + getPrecio() + ", getCoste()=" + getCoste()
				+ ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo() + "]";
	}
	
	
}
