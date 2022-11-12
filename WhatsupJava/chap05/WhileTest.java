package chap05;

public class WhileTest {

	public static void main(String[] args) {
		int i,j;
		
		i=10;
		while(i>0) //i값이 0보다 크면
		{
			j=0;
			while(j<i) {//j값이 i보다 작으면 반복
				System.out.print("*"); //println이 아닌 print
				j++; //j 값 증가
			}
			System.out.println();
			i--; //i값 감소
		}
	}

}
