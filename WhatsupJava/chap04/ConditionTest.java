package chap04;

public class ConditionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hour, min, sec;
		
		hour = 13;
		min = 30;
		sec = 25;
		
		String ampm;
		ampm = (hour >=12) ? "PM" : "AM"; //오전/오후 결정
		hour= (hour >=12) ? (hour-12) : hour; //24시간 표기를 12시간 표기로 변경
		
		System.out.println(ampm + "" + hour + ":" + min +":"+ sec);
	}

}
