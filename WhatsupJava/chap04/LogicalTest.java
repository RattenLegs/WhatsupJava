package chap04;

public class LogicalTest {

	public static void main(String[] args) {

		boolean x,y,z,b;
		
		x = false;
		y = z = true;
		
		b = x || y && z;
		//&&�� ||���� �켱���� ����
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(b);
	}

}
