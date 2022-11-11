package chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardTest {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		//InputStream 객체에 reader를 연결
		BufferedReader in = new BufferedReader(isr); //reader에 다시 버퍼 연결
		
		String str;
		System.out.println("글씨를 입력하면 따라합니다.");
		str = in.readLine(); //키보드로부터 한 줄 입력받음
		System.out.println(str);
	}

}
