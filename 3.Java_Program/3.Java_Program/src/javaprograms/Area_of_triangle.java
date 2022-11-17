package javaprograms;

import java.util.Scanner;

public class Area_of_triangle {
	public static void main(String arg[])
	{
		int base , height ;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length and breadth of the triangle : ");
		base = sc.nextInt();
		height = sc.nextInt();
		
		float area =(float) (base * height )/2;
		System.out.println("The area of a triangle having base "+base+" and height "+height+" is "+area+"\n");
		
		float c = (float)Math.sqrt(area);
		System.out.println("Using sqrt method in the java "+c);
	}
}
