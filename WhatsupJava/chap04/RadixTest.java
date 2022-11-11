package chap04;

public class RadixTest {

	public static void main(String[] args) {
		
		String num= "11";
	
		try {
			
		
		int bin = Integer.parseInt(num, 2); // 2진수 11
		int oct = Integer.parseInt(num, 8); // 8진수 11
		int dec = Integer.parseInt(num, 10); // 10진수 11
		int hex = Integer.parseInt(num, 16); // 16진수 11
		
		System.out.println("주어진값: " + num);
		System.out.println("2진수: " + bin);
		System.out.println("8진수: " + oct);
		System.out.println("10진수: " + dec);
		System.out.println("16진수: " + hex);
		} catch(NumberFormatException e) {
			System.out.println("ERROR: " + e);
		}
		
		
	}

}
