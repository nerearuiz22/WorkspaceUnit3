package CuentasEjercicio;

public class Cuenta {
	
	//Atributos
	private float Saldo;
	private static int NumDeposito;
	private static int NumRetiros;
	private float TasaAnual;
	private static float ComisionMensual;
	
	//Inicialización de atributos
	static {
		NumDeposito=0;
		NumRetiros=0;
		ComisionMensual=0;	
}
//Constructor
	public Cuenta(float saldo, float tasaAnual) {
		Saldo = saldo;
		TasaAnual = tasaAnual;
		
	}
//Métodos de acceso
	public float getSaldo() {
		return Saldo;
	}

	public void setSaldo(float saldo) {
		Saldo = saldo;
	}

	public static int getNumDeposito() {
		return NumDeposito;
	}

	public static void setNumDeposito(int numDeposito) {
		NumDeposito = numDeposito;
	}

	public static int getNumRetiros() {
		return NumRetiros;
	}

	public static void setNumRetiros(int numRetiros) {
		NumRetiros = numRetiros;
	}

	public float getTasaAnual() {
		return TasaAnual;
	}

	public void setTasaAnual(float tasaAnual) {
		TasaAnual = tasaAnual;
	}

	public static float getComisionMensual() {
		return ComisionMensual;
	}

	public static void setComisionMensual(float comisionMensual) {
		ComisionMensual = comisionMensual;
	}
	
	//MÉTODOS DE FUNCIONALIDAD
	public float depositarCantidad (float Sueldo) {
		float nuevoSaldo = 
    	return nuevoSaldo = 
    }
	
	public int retirarCantidad () {
    	return 
    }
	
	public int calcularInteresMensual () {
    	return 
    }
	
	public int extractoMensual () {
    	return 
    }
	
	@Override
	public String toString() {
		return "Cuenta [Saldo=" + Saldo + ", TasaAnual=" + TasaAnual + "]";
	}
	
	
	
	
	
	
	
}