package jUnitTestPackage;
import java.util.Scanner;

public class jUnitFunctions {
	
	public static void main(String args[])  
	{  
	int x, y, sum;  
	Scanner sc = new Scanner(System.in);  
	x = sc.nextInt();  
	y = sc.nextInt();  
	sum = addNumbers(x, y);  
	System.out.println(sum);  
	String k = addString("swaraj","bachu");
	
	}  
	
	public static int addNumbers(int a, int b)  
	{  
	int sum = a + b;  
	return sum;  
	} 
	public static String addString(String a,String b) {
		
		String add = a + b;
		return add;
	}
	
	
}  





