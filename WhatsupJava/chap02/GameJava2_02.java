package chap02;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class GameJava2_02 {

	public static void main(String[] args) {
		Date today = new Date();
		SimpleDateFormat dateForm = new SimpleDateFormat("YYYY년 MM월 dd일의 ");
		//오늘 날짜를 어떻게 출력할 것인지
		
		System.out.print(dateForm.format(today));
		//print()는 문자열을 출력하고 줄을 바꾸지 않는 명령
		
		Random r = new Random();
		int RandomNum = Math.abs(r.nextInt() % 100)+1;
		//100으로 나눈 나머지의 양수에 1을 더한 값
		
		System.out.println("금전운(100): " + RandomNum + "%");
	

	}

}
