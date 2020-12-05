package methodTest;

public class TestingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String name;
			name = new String("Andre Jackson");
			
			System.out.println(name);
			
			String surname;
			surname = new String("Opakunle");
			
			System.out.println(surname);
			
			
			
			char ch = surname.charAt(3);
			System.out.println("char at position 1 is " + ch); 
			
			double RandomValue;
			RandomValue = Math.random() * 101;
			System.out.println("RandomValue = " + RandomValue);
	}

}
