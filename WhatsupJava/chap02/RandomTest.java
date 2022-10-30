package chap02;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		Random r = new Random();
		
		System.out.println(Math.abs(r.nextInt() % 100));
		//난수값을 100으로 나눈 나머지를 난수로 바꿈
	}

}
