package ejemploFigurasGeometricas;

public abstract class FiguraGeometrica {
	
protected EnumFigura tipoFigura;

//NO NECESITAN IMPLEMENTACIÓN, ES DECIR RETURN


public abstract double calcularArea();

public abstract double calcularPerimetro();


//MÉTODO QUE NO SE PUEDE MODIFICAR ES EL FINAL
public final EnumFigura getTipo() {
	return this.tipoFigura;
}

}
