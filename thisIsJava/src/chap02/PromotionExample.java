package chap02;

public class PromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteValue = 10;
		int intValue = byteValue; //byte > int
		
		System.out.println(intValue);

		char charValue = '��';
		intValue = charValue; //char > int
		System.out.println("���� �����ڵ�"+ intValue);

		intValue = 500;
		long longValue = intValue;
		System.out.println(longValue);
	
		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue);
		
	}
	

}
