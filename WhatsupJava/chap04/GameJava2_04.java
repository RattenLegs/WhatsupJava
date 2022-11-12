package chap04;

import java.io.*;
import java.util.Random;

public class GameJava2_04 {

	public static void main(String[] args) throws IOException {
		
		int x, y;
		
		Random r = new Random();
		
		if(args.length==1) {//인수가 있으면 인수로 준 값으로 문제 출제
			x = Integer.valueOf(args[0]).intValue();
			//인수는 String 형이므로 Wrapper Class를 사용하여 int형으로 형변환
		} else {
			x = Math.abs(r.nextInt()%9) +1;
		}
		
		y = Math.abs(r.nextInt()%9)+1;
		
		int num = x*y;
		
		System.out.println();
		System.out.println("구구단: " + x + "단에 대한 문제입니다.");
		System.out.println();
		
		System.out.println(x + "*" + y + " = ");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String user;
		user = in.readLine(); // 키보드로부터의 입력
		
		int inputNum = new Integer(user).intValue(); 
		// 키보드에서 입력받은 값은 String형이므로 Wrapper Class를 사용하여 int형으로 변환
		
		if(num == inputNum) {
			System.out.println("맞았습니다.");
		} else {
			System.out.println("틀렸습니다.");
		}
		
	}

}
