package chap02;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		Random r = new Random(); //Random 클래스의 객체 생성
		
		System.out.println(Math.abs(r.nextInt() % 100));
		//난수 값을 100으로 나눈 나머지를 양수로 바꿈
	}

}
