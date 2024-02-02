package ejerciciosingles;

public class AppTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Time time = new Time(12,40,01);
		
		System.out.println(time);		
		
		Time time2 = time
		.previousSecondNew()
		.previousSecondNew()
		.previousSecondNew()
		;
		
		System.out.println(time2);	
		
	}

}
