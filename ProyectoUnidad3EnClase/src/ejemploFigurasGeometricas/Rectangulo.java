package ejemploFigurasGeometricas;

public class Rectangulo extends FiguraGeometrica{
		int base; // Atributo que define la base de un rectángulo
		int altura; // Atributo que define la altura de un rectángulo

		public Rectangulo () {
			this.tipoFigura=EnumFigura.POLIGONOS;
		}
		/**
		 * Constructor de la clase Rectangulo
		 * 
		 * @param base   Parámetro que define la base de un rectángulo
		 * @param altura Parámetro que define la altura de un rectángulo
		 */
		public Rectangulo(int base, int altura) {
			this.base = base;
			this.altura = altura;
		}

		/**
		 * Método que calcula y devuelve el área de un rectángulo como la multiplicación
		 * de la base por la altura
		 * 
		 * @return Área de un rectángulo
		 */
		
		
		
		@Override
		public double calcularArea() {
			return base * altura;
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
		/**
		 * Método que calcula y devuelve el perímetro de un rectángulo como (2 * base) +
		 * (2 * altura)
		 * 
		 * @return Perímetro de un rectángulo
		 */
		
		@Override
		public double calcularPerimetro() {
			return (2 * base) + (2 * altura);
		}
	}