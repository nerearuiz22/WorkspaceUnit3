package Enumerados;


public enum EnumeradoComplejoEstudiante {
	
	 EXCHANGE_STUDENT("EXCHANGE STUDENTXXX", 1, "INTERNATIONAL"), NATIONAL_STUDENT("NATIONAL STUDENT", 2, "NATIONAL"),
	   STATE_STUDENT("STATE STUDENT", 3, "LOCAL");

		   private String description;
		   private int id;
		   private String nameStudent;

		   EnumeradoComplejoEstudiante(String description, int id, String nameStudent) {
		       // TODO Auto-generated constructor stub
			   this.nameStudent = nameStudent;
		       this.description = description;
		       this.id = id;
		       

		   }

		   public String getDescription() {

		       return this.description;
		   }

		   public int getId() {
		       return id;
		   }

		   public String getnameStudent() {
		       return nameStudent;
		   }

		

	}


