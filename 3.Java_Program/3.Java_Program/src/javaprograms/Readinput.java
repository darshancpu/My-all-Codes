package javaprograms;

import java.util.Scanner;

public class Readinput {
	public static void main(String []arg)
	{
		int a ,b , c;
		System.out.print("Enter the 2 number : ");
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		c = a+b;
		System.out.println("Sum of "+a+" and "+b+" is "+c);
	}
}
