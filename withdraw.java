import java.util.Scanner;
public class withdraw {
	public static void main(String[]args)
	{
		Scanner s =new Scanner(System.in);
		System.out.println("entr the amount");
		int amount=s.nextInt();
	

		if(amount<500)
		{
			throw new ArithmeticException("cannot withdraw money");
			
		}
		else
		{
			System.out.println("the withdraw");
		}
		
		
		
	
          
		}
	}
