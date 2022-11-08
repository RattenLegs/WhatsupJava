package chap04;

public class CastingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myInt;
		float myFloat = (float) 3.0; //double형을 float형으로 변환
		double myDouble;
		myInt = (int) myFloat;
		myDouble = myInt;
		
		System.out.println(myInt);
		System.out.println(myFloat);
		System.out.println(myDouble);

	}

}
