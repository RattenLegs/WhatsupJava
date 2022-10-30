package chap02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDataFormatTest {

	public static void main(String[] args) {
		Date today = new Date();
		
		SimpleDateFormat dateForm = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		//출력형식 지정
		
		System.out.println(dateForm.format(today));
		//미리 지정한 출력형식에 맞춰 화면 출력

	}

}
