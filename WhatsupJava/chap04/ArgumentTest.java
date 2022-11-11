package chap04;

public class ArgumentTest {

	public static void main(String[] args) {
		
		for(int i=0; i<args.length; i++) {//첨자는 0부터 시작
			System.out.println(i+":"+args[i]);
		}

	}

}
