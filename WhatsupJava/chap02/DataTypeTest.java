package chap02;

public class DataTypeTest {

	public static void main(String[] args) {
		
		//변수 선언
		int i;
		float f;
		double d;
		char c;
		boolean b;
		
		i = 120;
		//f=12.23;
		f = 12.23f; //f는 12.23이 float형이라는 점을 명시
		d = 12.23; //실수 뒤 아무 표시 없으면 double 취급
		c = 'a';
		b = true;
		
		System.out.println("Data Practice Program");
		System.out.println("---------------------");
		System.out.println("int: " + i);
		System.out.println("float: " + f);
		System.out.println("double: " + d);
		System.out.println("char: " + c);
		System.out.println("boolean: " + b);
		
		

	}

}
