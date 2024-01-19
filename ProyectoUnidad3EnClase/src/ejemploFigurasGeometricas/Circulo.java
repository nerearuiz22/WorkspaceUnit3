package ejemploFigurasGeometricas;

public class Circulo {

	private int radio;

	public Circulo(int radio) {
		super();
		this.radio = radio;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	public double calcularArea (int area) {
    	return  Math.PI*(Math.pow(radio, 2));
    }
	
	public double calcularPerimetro (int perimetro) {
    	return 2*Math.PI*radio ;
    }
	
	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}

}
