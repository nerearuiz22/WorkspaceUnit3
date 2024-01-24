package Enumerados;

public enum EnumCoches {
	
	//ENUMERACIÓN

	ELECTRICO (1,"Motor Eléctrico", "SEV"), DIESEL (2,"Motor Diesel", "DV"), 
	GAS (3,"Motor de gas", "GV"), HIDROGENO (4, "Motor de Hidrogeno", "HEV");
	
	//PROPIEDADES
	
	   private int id;
	   private String tipoMotor;
	   private String tipoCoche;
	
	//CONSTRUCTOR
	   EnumCoches(int id, String tipoMotor, String tipoCoche) {
		   this.id = id;
		   this.tipoMotor = tipoMotor;
		   this.tipoCoche = tipoCoche;
	   }
	   
	  //GETTERS
	   public int id() {
	       return this.id;
	   }

	   public String getipoMotor() {
	       return tipoMotor;
	   }

	   public String gettipoCoche() {
	       return tipoCoche;
	   }
}
