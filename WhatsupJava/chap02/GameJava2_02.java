package chap02;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class GameJava2_02 {

	public static void main(String[] args) {
		Date today = new Date();
		SimpleDateFormat dateForm = new SimpleDateFormat("YYYY�� MM�� dd���� ");
		//���� ��¥�� ��� ����� ������
		
		System.out.print(dateForm.format(today));
		//print()�� ���ڿ��� ����ϰ� ���� �ٲ��� �ʴ� ���
		
		Random r = new Random();
		int RandomNum = Math.abs(r.nextInt() % 100)+1;
		//100���� ���� �������� ����� 1�� ���� ��
		
		System.out.println("������(100): " + RandomNum + "%");
	

	}

}
