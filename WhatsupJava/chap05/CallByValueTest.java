package chap05;

public class CallByValueTest {

	public static void swap(int x, int y) {
		int temp=x; // x값 보관
		x=y;
		y=temp;
	}
	
	public static void main(String[] args) {

		int a=10;
		int b=20;
		
		System.out.println("swap()메소드 호출 전: " + a + ", " + b);
		swap(a, b);
		System.out.println("swap()메소드 호출 후: " + a + ", " + b);
	}

}
