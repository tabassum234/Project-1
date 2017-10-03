
public class FooBarBaz {
	// Tabassum Bhuiyan Period 2
	public static void main(String[] args)
	{
		//  Replace the multiples of 3 with “foo” 
		// Replace the multiples of 7 with “bar”
		// Replace multiples of 10 with “baz”
		// All other numbers should be printed as just the number.
		// If a number meets more than one of the criterion 1-3, print a combination of words.
		for (int n=1; n<=500; n++)
		{
			{
				if (n%3==0)
				{
					System.out.println("foo") ;
				}
				if (n%7==0)
				{
					System.out.println("bar") ;
				}
				if (n%10==0)
				{
					System.out.println("baz") ;
				}
				if ((n%3==0) && (n%7==0))
				{
					System.out.println("foo" + "bar") ;
				}
				if ((n%7==0) && (n%10==0))
				{
					System.out.println("bar" + "baz") ;
				}
				if ((n%3==0) && (n%10==0))
				{
					System.out.println("foo" + "baz") ;
				}
				if ((n%3==0) && (n%7==0) && (n%10==0))
				{
					System.out.println("foo" + "bar" + "baz") ;
				}
				else System.out.println(" ") ;
		}
		}
	}

	private static void println(String string) {
		
	}

}
