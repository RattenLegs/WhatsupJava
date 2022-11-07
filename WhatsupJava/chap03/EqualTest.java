package chap03;

public class EqualTest {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = new String("Hello");
		String str3 = str1;
		String str4 = str2;
		
		System.out.println("== 관계");
		System.out.println("str1 == str1: " +(str1==str1));
		//같은 변수니 당연히 같음
		System.out.println("str1 == str2 " +(str1==str2));
		//가리키는 문자열의 내용은 같지만 저장하고 있는 메모리 주소는 다름
		System.out.println("str1 == str3 " +(str1==str3));
		//str3은 str1을 복사한 변수
		System.out.println("str1 == str3 " +(str2==str4));
		//str4는 str2를 복사한 변수
		System.out.println();

		System.out.println("Equal 관계");
		System.out.println("str1 equls str1 : "+(str1.equals(str1)));
		//같은 변수이니 당연히 같음
		System.out.println("str1 equls str2 : "+(str1.equals(str2)));
		//저장한 메모리 주소는 다르지만 가리키는 문자열의 내용은 같음
		System.out.println("str1 equls str3 : "+(str1.equals(str3)));
		// str3는 str1을 복사한 변수
		System.out.println("str1 equls str4 : "+(str1.equals(str4)));
		// str4는 str2를 복사한 변수

	}

}
