package chap03;

import java.util.Random;

public class GameJava2_03 {

	public static void main(String[] args) {
		
	//0~2 ������ ������ ���Ѵ�.
	Random r = new Random();
	int computer = Math.abs(r.nextInt() % 3);
	System.out.println(computer); //abs: ���밪
	
	}

}
