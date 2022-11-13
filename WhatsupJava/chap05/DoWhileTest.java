package chap05;

public class DoWhileTest {

	public static void main(String[] args) {
		int i,j;
		
		i=10;
		
		do {
			j=0;
			do {
				System.out.print("*");
				j++; //j값 증가
			} while(j<i); //j값이 i값보다 작으면 반복
				System.out.println();
				i--;
			
		} while(i>0); //i값이 0보다 크면 반복
	}

}
 