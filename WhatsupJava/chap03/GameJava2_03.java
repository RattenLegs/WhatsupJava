package chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class GameJava2_03 {

	public static void main(String[] args) throws IOException {//IOException: Stream 입력 중 예측 못한 값을 만나면 그 처리를 자바에게 양보한다
		
	//0~2 사이의 난수를 구한다.
	Random r = new Random();
	int computer = Math.abs(r.nextInt() % 3);
	System.out.println(computer); //abs: 절대값
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	String user;
	System.out.println();
	user = in.readLine(); //키보드로부터 한 줄을 입력받음
	
	if(user.equals("a")) {
		if(computer == 0) System.out.println("무승부(가위)");
		if(computer == 1) System.out.println("컴퓨터 승(바위)");
		if(computer == 2) System.out.println("사람 승(보)");
	} 	else if(user.equals("b")) {
		if(computer == 0) System.out.println("사람 승(가위)");
		if(computer == 1) System.out.println("무승부(바위)");
		if(computer == 2) System.out.println("컴퓨터 승(보)");
	}else if(user.equals("c")) {
		if(computer == 0) System.out.println("컴퓨터 승(가위)");
		if(computer == 1) System.out.println("사람 승(바위)");
		if(computer == 2) System.out.println("무승부(보)");
	}
	
	}

}
