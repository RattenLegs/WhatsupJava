package chap04;

public class WrapperTest {

	public static void main(String[] args) {
		int myInt = 5316;
		System.out.println("myInt: " + myInt);
		
		String myString = new Integer(myInt).toString();
		//int형 -> Integer형 객체 -> String형 객체
		System.out.println("myString = " + myString);
		
		myString=myString.replace('6', '4'); //5316 > 5314
		
		float myFloat = Float.valueOf(myString).floatValue();
		//String형 객체 > Float형 객체 > float형
		
		System.out.println("myFloat= " + myFloat);
	}

}
