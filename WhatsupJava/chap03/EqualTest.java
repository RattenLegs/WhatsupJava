package chap03;

public class EqualTest {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = new String("Hello");
		String str3 = str1;
		String str4 = str2;
		
		System.out.println("==����");
		System.out.println("str1 == str1: " +(str1==str1));
		//���� ������ �翬�� ����
		System.out.println("str1 == str2 " +(str1==str2));
		//����Ű�� ���ڿ��� ������ ������ �����ϰ� �ִ� �޸� �ּҴ� �ٸ�
		System.out.println("str1 == str3 " +(str1==str3));
		//str3�� str1�� ������ ����
		System.out.println("str1 == str3 " +(str2==str4));
		//str4�� str2�� ������ ����
		System.out.println();

		System.out.println("Equal ����");
		System.out.println("str1 equls str1 : "+(str1.equals(str1)));
		//���� �����̴� �翬�� ����
		System.out.println("str1 equls str2 : "+(str1.equals(str2)));
		//������ �޸� �ּҴ� �ٸ����� ����Ű�� ���ڿ��� ������ ����
		System.out.println("str1 equls str3 : "+(str1.equals(str3)));
		// str3�� str1�� ������ ����
		System.out.println("str1 equls str4 : "+(str1.equals(str4)));
		// str4�� str2�� ������ ����

	}

}
