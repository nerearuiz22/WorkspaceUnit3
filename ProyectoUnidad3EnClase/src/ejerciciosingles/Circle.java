package ejerciciosingles;

public class Circle {

	private double radius = 1.0;
	private String color = "Red";
	
	
	public Circle () {
		double radius = 1.0;
	    String color = "Red";
	}


	public Circle(double radius, String color) {
		this();
		this.radius = radius;
		this.color = color;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	
}
