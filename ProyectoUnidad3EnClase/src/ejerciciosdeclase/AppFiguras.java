package ejerciciosdeclase;

import ejemploFigurasGeometricas.Circulo;
import ejemploFigurasGeometricas.Cuadrado;
import ejemploFigurasGeometricas.Rectangulo;
import ejemploFigurasGeometricas.TrianguloRectangulo;

public class AppFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FiguraGeometrica [] arrayFiguras = new FiguraGeometrica [5];
		
		Circulo cir = new Circulo(10);
		Circulo cir2;
		
		FiguraGeometrica varSuperCirculo = new Circulo(15);
		FiguraGeometrica varSuperRectangulo = new Rectangulo(5,10);
		cir.getRadio();
		
		cir2 = (Circulo) varSuperCirculo;
		
		//DA FALLO, NO SE LE PUEDE ASIGNAR A UN CIRCULO UN RECTANGULO, NO PUEDE SER CASTEADO ASÍ
		//cir2 = (Circulo) varSuperRectangulo;
	
		//Si es, castea, si no es no castea. Asi se evitan errores
		if (varSuperCirculo instanceof Circulo)
			cir2 = (Circulo) varSuperCirculo;
		
		if (varSuperRectangulo instanceof Circulo)
			cir2 = (Circulo) varSuperRectangulo;
		
	
		arrayFiguras[0]= cir;
		arrayFiguras[1]= new FiguraGeometrica ();
		arrayFiguras[2]= new Rectangulo (4,8);
		arrayFiguras[3]= new Cuadrado (5);
		arrayFiguras[4]= new TrianguloRectangulo (3,7);
		
		System.out.println(cir.calcularArea());
	
		for (int i=0; i<arrayFiguras.length; i++) {
			System.out.println("Area:" + arrayFiguras[i].calcularArea());
			System.out.println("Perimetro:" + arrayFiguras[i].calcularPerimetro());
			System.out.println("Tipo:" + arrayFiguras[i].getTipo());
		}

	}

}
