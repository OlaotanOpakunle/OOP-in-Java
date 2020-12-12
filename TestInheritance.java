package methodTest;

public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int xpos, ypos;
		
		TwoDShape tds = new TwoDShape(12, 33);
		
		xpos = tds.getXPos();
		
		ypos = tds.getYPos();
		System.out.println("tds x position = " + xpos + " y position = " + ypos + "\n");
		
		
		tds.setXPos(77);
		xpos = tds.getXPos();
		
		System.out.println("tds x position = " + xpos + " y position = " + ypos + "\n");
	
		System.out.println("tfd toString() method = " + tds.toString() + "\n");
		
		
		UsingGettersAndSettersForCircle c1 = new UsingGettersAndSettersForCircle(10.759, 14, 55);
	 
		xpos = c1.getXPos();
		ypos = c1.getYPos();
		
		System.out.println("c1 x position = " + xpos + " y position = " + ypos + "\n");
		
		double area = c1.calculateArea();
		double perimeter = c1.calculatePerimeter();
		
		System.out.println("c1 area = " + area + " c1 perimeter = " + perimeter + "\n");
		
	}

}
