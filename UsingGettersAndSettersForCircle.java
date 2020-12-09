package methodTest;

public class UsingGettersAndSettersForCircle {
	private double radius;
	
	public UsingGettersAndSettersForCircle() {
		
		radius = 1.0;
	}
	
	public UsingGettersAndSettersForCircle(double newValue) {
		radius = newValue;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double newRadiusValue) {
		if(newRadiusValue < 0) {
			radius = 1;
		}
		
		else {
			radius = newRadiusValue;
		}
		
	}
	public double CalculateArea() {
	double area;
	area = Math.PI * radius *radius;
	return area;
	
}

	public double CalculatePerimeter() {
		double perimeter;
		perimeter = 2 * Math.PI * radius;
		return perimeter;
	}
	
	public String toString() {
		return "radius is: " + radius;
	}
}