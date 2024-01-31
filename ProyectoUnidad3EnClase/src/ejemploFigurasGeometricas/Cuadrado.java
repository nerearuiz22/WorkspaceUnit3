package ejemploFigurasGeometricas;

import ejerciciosdeclase.EnumFigura;
import ejerciciosdeclase.FiguraGeometrica;

public class Cuadrado extends FiguraGeometrica{
		int lado; // Atributo que define el lado de un cuadrado
		private EnumFigura tipoFigura;

		/**
		 * Constructor de la clase Cuadrado
		 * 
		 * @param lado Parámetro que define la longitud de la base de un cuadrado
		 */
	public Cuadrado (){
		this.tipoFigura=EnumFigura.POLIGONOS;
	}
	
	
		
		public int getLado() {
			return lado;
		}



		public void setLado(int lado) {
			this.lado = lado;
		}



		public EnumFigura getTipoFigura() {
			return tipoFigura;
		}



		public void setTipoFigura(EnumFigura tipoFigura) {
			this.tipoFigura = tipoFigura;
		}



		public Cuadrado(int lado) {
			this.lado = lado;
			this.tipoFigura=EnumFigura.POLIGONOS;
		}

		/**
		 * Método que calcula y devuelve el área de un cuadrado como el lado elevado al
		 * cuadrado
		 * 
		 * @return Área de un Cuadrado
		 */
		
		
		@Override
		public double calcularArea() {
			return lado * lado;
		}

		/**
		 * Método que calcula y devuelve el perímetro de un cuadrado como cuatro veces
		 * su lado
		 * 
		 * @return Perímetro de un cuadrado
		 */
		
		@Override
		public double calcularPerimetro() {
			return (4 * lado);
		}
	}

