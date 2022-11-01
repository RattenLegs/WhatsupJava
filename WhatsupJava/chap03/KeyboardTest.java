package chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardTest {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		//InputStream 객체에 리더를 연결
		BufferedReader in = new BufferedReader(isr); //리더에 다시 버퍼를 연결
		//버퍼에 스트림으로 받은 문자들을 모으는 것
		
		String str;
		System.out.println("글씨를 입력하면 따라합니다.");
		str = in.readLine();
		System.out.println(str);
	}

}
