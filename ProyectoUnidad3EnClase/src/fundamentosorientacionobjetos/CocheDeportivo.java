package fundamentosorientacionobjetos;

public class CocheDeportivo extends Coche {
	
	  private static final String TYPE_CD="Coche Deportivo";

		  public CocheDeportivo(String color, String marca, String modelo, double precio, double coste) {
		    super();
			}
		  
		  public String getTipoCoche() {
			  return TYPE_CD;
				}
		  

		@Override
		public String toString() {
			return "CocheDeportivo [getColor()=" + getColor() + ", getPrecio()=" + getPrecio() + ", getCoste()="
					+ getCoste() + ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo() + "]";
		}

		
	}

	
