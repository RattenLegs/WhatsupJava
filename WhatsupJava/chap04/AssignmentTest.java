package chap04;

public class AssignmentTest {

	public static void main(String[] args) {
		int x,y,z;
		
		x=y=z=1;
		
		z += x+y; //z = z+x+y�� ����
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		x += y-= z = 5; //z=5; y=y-z; x=x+y;�� ����
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

	}

}
