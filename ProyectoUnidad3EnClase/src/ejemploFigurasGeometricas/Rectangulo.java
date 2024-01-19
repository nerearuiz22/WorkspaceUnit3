package ejemploFigurasGeometricas;

public class Rectangulo {
	
	private int base;
	private int altura;

	
	public Rectangulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	//Métodos funcionales
	 public double calcularArea (int area) {
	    	return base*altura;
	    }
		
	 public double calcularPerimetro (int perimetro) {
	    	return (base*altura)*2;
	    }

	@Override
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + "]";
	}

}