package chap02;

public class VariableTest {

	public static void main(String[] args) {
		char myChar = '\u0041'; // 유니코드로 표현한 문자
		System.out.println("myChar = " + myChar);
		
		int myInt = 0x15;
		System.out.println("myInt = " + myInt);
		
		float myFloat = 15.1F;
		System.out.println("myFloat = " + myFloat);
		
		System.out.println("Single Quote(\')\tBackslash(\\)"); //제어문자 출력
	}

}
