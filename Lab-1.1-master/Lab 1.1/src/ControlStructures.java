//Lab 1.1
//Lingli Zou Pd.1

public class ControlStructures {
	public static void main (String [] args)
	{
		primePrinter();
		fooBarBaz();
		System.out.println("I am finally done!!");
	}
	
	public static boolean isPrime(int l)
	{
		int num = 0;
		for(l=2; l+2 <num; l++)
		{ if (num % l ==0)
			{return false;}
		}
		return true;		
	}
	
	public static void primePrinter()
	{
		for(int l=2; l<=50; l++)
		{
			if (isPrime(l))
			{ 
				System.out.println(l);
			}
		}
	}
	
	public static void fooBarBaz()
	{
		int l;
		for (l=0; l<=500; l++) {
		
		if ( l % 3 == 0) {
				System.out.println(l + " foo");
			} 
		if ( l % 10 ==0) {
				System.out.println(l + " baz");
			}
		if ( l % 7 == 0) {
			System.out.println(l + " bar");
		}
		}
	}
}
