package chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class GameJava2_03 {

	public static void main(String[] args) throws IOException {//IOException: Stream �Է� �� ���� ���� ���� ������ �� ó���� �ڹٿ��� �纸�Ѵ�
		
	//0~2 ������ ������ ���Ѵ�.
	Random r = new Random();
	int computer = Math.abs(r.nextInt() % 3);
	System.out.println(computer); //abs: ���밪
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	String user;
	System.out.println();
	user = in.readLine(); //Ű����κ��� �� ���� �Է¹���
	
	if(user.equals("a")) {
		if(computer == 0) System.out.println("���º�(����)");
		if(computer == 1) System.out.println("��ǻ�� ��(����)");
		if(computer == 2) System.out.println("��� ��(��)");
	} 	else if(user.equals("b")) {
		if(computer == 0) System.out.println("��� ��(����)");
		if(computer == 1) System.out.println("���º�(����)");
		if(computer == 2) System.out.println("��ǻ�� ��(��)");
	}else if(user.equals("c")) {
		if(computer == 0) System.out.println("��ǻ�� ��(����)");
		if(computer == 1) System.out.println("��� ��(����)");
		if(computer == 2) System.out.println("���º�(��)");
	}
	
	}

}
