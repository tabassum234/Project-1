
public class ControlStructures {
	// Tabassum Bhuiyan Period 2
	public static void main(String[] args) 
	{
		// Prints the first 50 prime numbers, 10 numbers per line
		for (int i=2; i<=230; i++)
		{
			for (int j=2; j<=i; j++ )
			{
				if (j==i)
				{
					System.out.println(i);
					}
				if (i%j==0)
				{
					break;
				}
			}
		}
	}

}
		// Tabassum Bhuiyan Period 2
