import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class checkNumbers
	{
	public static int counter = 0;
	
	public static void main(String[] args)
	{
		inputNumbers.greeting();
		
		checkNumbers.readLines("McGuireNumbers");
		
		System.out.println(counter);

	}
	
		
		public static void readLines(String fileName)
		{
		String line = null;

		try
		{
		FileReader fileReader = new FileReader(fileName);
		BufferedReader bufferedReader = new BufferedReader(fileReader);

		while ((line = bufferedReader.readLine()) != null)
		{

		// method (line);
		manipulateNumbers(line);
		}
		bufferedReader.close();
		} catch (FileNotFoundException ex)
		{
		System.out.println("Unable to open file '" + fileName + "'");
		} catch (IOException ex)
		{
		System.out.println("Error reading file '" + fileName + "'");
		}

		}
		
		// Check if numbers are valid here:
		public static void manipulateNumbers(String line)
		{
			
			int digit = 0;
			int sum = 0;
			int lastDigit = 0;
			int sumDigit = 0;
			
			for (int i = 0; i < line.length(); i++)
			{
				
				if (i%2 == 0)
				{
					//Doing (i, i+2) fixed the code to 29
					digit = 2*(Integer.parseInt(line.substring(i, i+2)));
				}
				
				
				
				if (digit >= 10)
				{
					
					lastDigit = digit%10;
					sumDigit += lastDigit;
					digit = sumDigit;
					
				}
				
				
				sum += digit;
				
			}
			
			if (sum%10 == 0)
			{
				counter++;
			}
			
		}



	}
