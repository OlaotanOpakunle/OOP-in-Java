package methodTest;
import static java.lang.System.out;
public class TestUsingGettersAndSettersForCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsingGettersAndSettersForCircle c1 = new UsingGettersAndSettersForCircle();
		UsingGettersAndSettersForCircle c2 = new UsingGettersAndSettersForCircle(34.887);
		
		double c1RadiusValue = c1.getRadius();
		double c2RadiusValue = c2.getRadius();
		
		System.out.println("c1 Radius Value is: " + c1RadiusValue);
		System.out.println("c2 Radius Value is: " + c2RadiusValue);

		c1.setRadius(12.432);
		c1RadiusValue = c1.getRadius();
		System.out.println("c1 Radius Value is: " + c1RadiusValue);
		
		double areac2 = c2.CalculateArea();
		double perimeterc2 = c2.CalculatePerimeter();
		
		System.out.println("c2 area = " + areac2);
		System.out.println("c2 perimeter = " + perimeterc2);
		
		out.println(c2.toString());
	}

}
