package ejerciciosingles;

public class Cylinder extends Circle{

	private double height=0.0;
	
	
	public Cylinder(double radius, double height, String color) {
		super(radius,color);
		this.height=height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	
	@Override
	public double getArea() {
		return 2*Math.PI * this.height + 2 * Math.PI * Math.pow(this.getRadius(),2);
	}
	
	public double getVolume () {
		return this.getArea()*this.height;
	}
	
}
