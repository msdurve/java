
public class ByteShortIntLong {
	public static void main(String[] args) {
		int i = 50_11_000;
		System.out.println(i);
		
		byte byteNumber = 125 ; 
		short shortNumber = 250 ; 
		int intNumber= 50000  ; 
		
		long longNumber = 50_000L + (10L* (byteNumber + shortNumber + intNumber) ) ; 
		System.out.println(Integer.MAX_VALUE);
		System.out.println(longNumber);
		
	}
}