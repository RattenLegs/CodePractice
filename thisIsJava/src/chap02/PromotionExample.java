package chap02;

public class PromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteValue = 10;
		int intValue = byteValue; //byte > int
		
		System.out.println(intValue);

		char charValue = '가';
		intValue = charValue; //char > int
		System.out.println("가의 유니코드"+ intValue);

		intValue = 500;
		long longValue = intValue;
		System.out.println(longValue);
	
		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue);
		
	}
	

}
