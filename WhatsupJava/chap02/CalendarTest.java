package chap02;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance(); //반드시 getInstance() 메서드로 생성
		
		int hour = now.get(Calendar.HOUR); //get()메서드로 시간 정보 얻기 선언
		int min = now.get(Calendar.MINUTE);
		
		System.out.println("현재시간은 " + hour + "시 " + min + "분 입니다.");
		
	}

}
