package chap04;

public class BitwiseTest {

	public static void main(String[] args) {
		
		int x, y;
		
		x = 8; // 0000 0000 0000 0000 0000 0000 0000 1000
		y = ~x; // 1111 1111 1111 1111 1111 1111 1111 0111 //y는 x의 보수
		
		System.out.println("x= "+x);
		System.out.println("y= "+y);
		
		System.out.println(x + " AND " + y + " = " + (x & y));
		// 0000 0000 0000 0000 0000 0000 0000 0000
		System.out.println(x + " OR " + y + " = " + (x | y));
		// 1111	1111 1111 1111 1111 1111 1111 1111
		System.out.println(x + " XOR " + y + " = " + (x ^ y));
		// 1111 1111 1111 1111 1111 1111 1111 1111
		
		x= x<<2; // 0000 0000 0000 0000 0000 0000 0010 0000
		y= y<<2; // 1111 1111 1111 1111 1111 1111 1101 1100
		
		System.out.println("x = " + x + "(x<<2), y = " + y + " (y<<2)");
		
		x= x>>2; // 0000 0000 0000 0000 0000 0000 0000 1000
		y= y>>2; // 1111 1111 1111 1111 1111 1111 1111 0111
		
		System.out.println("x = " + x + "(x>>2), y = " + y + " (y>>2)");
		
		x= y>>2; // 1111 1111 1111 1111 1111 1111 1111 1101
		y= y>>>2; // 0011 1111 1111 1111 1111 1111 1101 1101
		
		System.out.println("x = " + x + "(y>>2), y = " + y + " (y>>>2)");
		
		
	}

}
