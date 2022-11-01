package chap03;

public class SwitchTest {

	public static void main(String[] args) {
		int num = 2;
		
		switch(num) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("오오");
		case 3:
			System.out.println("2 또는 3");
			
		case 4:
			System.out.println("1,2,3이 압니다.");
			break;
		}

	}

}
