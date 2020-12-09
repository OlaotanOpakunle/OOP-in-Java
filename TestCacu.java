package methodTest;

public class TestCacu {

	public static void main(String[] args) {
	Cacu c3 = new Cacu();
	Cacu c4 = new Cacu(49.987);
	
	double c3Radius = c3.getRadius();
	double c4Radius = c4.getRadius();
	
	System.out.println(c3Radius);
	System.out.println(c4Radius);
	}

}
