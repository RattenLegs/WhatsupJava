package chap02;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance(); //�ݵ�� getInstance() �޼���� �ۼ�
		
		int hour = now.get(Calendar.HOUR);
		int min = now.get(Calendar.MINUTE);
		
		System.out.println("����ð��� " + hour + "��" + min + "�� �Դϴ�.");
		
	}

}
