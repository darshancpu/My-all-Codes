package javaprograms;

public class DataTpye {
	public static void main(String arg[])
	{
		System.out.println("Min of int : "+Byte.MIN_VALUE);
		System.out.println("Min of int : "+Byte.MAX_VALUE);
		long l = 99_798_343;
		System.out.println("underscore are allowed in java "+l);
		
		int x = 5;
		System.out.println(Integer.toBinaryString(x));
		
		char r= 0x0370;
		System.out.println(r);
	}
}