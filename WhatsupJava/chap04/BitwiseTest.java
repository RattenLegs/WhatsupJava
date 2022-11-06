package chap04;

public class BitwiseTest {

	public static void main(String[] args) {
		
		int x, y;
		
		x = 8; // 0000 0000 0000 0000 0000 0000 0000 1000
		y = ~x; // 1111 1111 1111 1111 1111 1111 1111 0111 //y는 x의 보수
		
		System.out.println("x= "+x);
		System.out.println("y= "+y);
		
		
	}

}
