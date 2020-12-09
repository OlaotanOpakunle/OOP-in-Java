package methodTest;


public class TestCircle {
	
	public static void main(String[] args) {
	
	Circle c1 = new Circle();
	Circle c2 = new Circle(34.887);
	
	double c1RadiusValue = c1.getRadius();
	double c2RadiusValue = c2.getRadius();
	
	System.out.println("c1 Radius Value is: " + c1RadiusValue);
	System.out.println("c2 Radius Value is: " + c2RadiusValue);

}
}