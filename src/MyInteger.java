import java.util.Scanner;
public class MyInteger {

	private static int value;
	
	
	
	
	public int conStruct()
	{
			int num = 1082;
			return num;
	}
	
	
	public MyInteger(int value)
	{
		int v = value;
		if ( v < Integer.MAX_VALUE || v > Integer.MIN_VALUE ) 
		{
			System.out.println("Value must be between -2147483648 "
					+ "2147483647");
		}	
	}
	
	
	public static int getvalue()
	{
		int v = value;
		return v;
	}
	
	public static void setvalue()
	{
		System.out.println("Enter a value: ");
		Scanner keyboard = new Scanner(System.in);
		int v = keyboard.nextInt();
		v = value;
	}
	
	public static boolean isEven(int val) 
	{
		
		if(val % 2 == 0) 
		return true;
		else return false;
		
	}
	
	public static boolean isOdd(int val) 
	{
		
		if(val % 2 != 0) 
		return true;
		else return false;
	}
	
	public int add(int v1, int v2) 
	{
		int sum = v1 + v2;
		return sum;
	}
	
	public void toString(int v) 
	{
		
	}
	
	
	/*********************************************/
	
	
	public static void main(String[] args) 
	{
		setvalue();
		int num = getvalue();
		isEven(num);
		isOdd(num);
		
		
		
	}
	
}
