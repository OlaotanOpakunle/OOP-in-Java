package methodTest;

public class TestDice {

	public static void main(String[] args) {
		
		Dice d1, d2;
		d1 = new Dice();
		d2 = new Dice();
		
		int d1FaceValue = d1.getFaceValue();
		int d2FaceValue = d2.getFaceValue();
		
		System.out.println("d1 Face Value = " + d1FaceValue);
		System.out.println("d2 Face Value = " + d2FaceValue);
	}

}
