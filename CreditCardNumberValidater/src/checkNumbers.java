
public class checkNumbers
	{
		public static int[] creditCardNumbers = new int[16];
		static long validCard = (long) 5424180123456789.;
		static long invalidCard = (long) 5424180123456787.;
		
		public static void callMethod()
		{
	
			doubleDigits();
			addTwoDigits();
			replaceDigits();
			divisibleTen();
	
		}
		
		
		public static void doubleDigits()
		{
		//Step 1: double alternating digits starting with the first digit
			for (int i = 0; i <= 16; i++)
				{
					creditCardNumbers[i] = (int) ((int) (validCard%10) + (validCard/10));
					
				}
		
		}
		
		public static void addTwoDigits()
		{
			//Step 2: if doubling resulted in number with with digits, add them together to get single digit number
			
		}
		
		public static void replaceDigits()
		{
			//Step 3: replace digits that manipulated, then add them all up
		}
		
		public static void divisibleTen()
		{
			// Step 4: check to see if divisible by 10
		}

	}
