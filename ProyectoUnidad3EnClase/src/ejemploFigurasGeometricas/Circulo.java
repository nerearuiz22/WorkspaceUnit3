package ejemploFigurasGeometricas;

import ejerciciosdeclase.EnumFigura;
import ejerciciosdeclase.FiguraGeometrica;

//EXTENDS --> DECLARAS LA HERENCIA DE OTRA CLASE
//MÉTODOS IGUALES QUE LA CLASE PADRE


public class Circulo extends FiguraGeometrica{
	private int radio; // Atributo que define el radio de un círculo

	public Circulo () {
		this.tipoFigura = EnumFigura.ELIPSES; 
	}
	
	/**
	 * Constructor de la clase Círculo
	 * 
	 * @param radio Parámetro que define el radio de un círculo
	 */
	public Circulo(int radio) {
		this(); //LLAMO AL CONSTRUCTOR SIN PARÁMETROS //this.tipoFigura = EnumFigura.ELIPSES;  --> Para no escribirlo 2 veces
		this.radio = radio;
	}
	
	

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	/**
	 * Método que calcula y devuelve el área de un círculo como pi multiplicado por
	 * el radio al cuadrado
	 * 
	 * @return Área de un círculo
	 */
	public double calcularArea() {
		return Math.PI * Math.pow(radio, 2);
	}

	/**
	 * Método que calcula y devuelve el perímetro de un círculo como la
	 * multiplicación de pi por el radio por 2
	 * 
	 * @return Perímetro de un círculo
	 */
	public double calcularPerimetro() {
		return 2 * Math.PI * radio;
	}
}