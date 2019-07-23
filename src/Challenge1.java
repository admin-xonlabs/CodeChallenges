
public class Challenge1 {

	public static int compliment (int n)
	{
		int result;
		result= 1-n;
		
		/*
		 * Complete this method
		 * If the input number 'n' is 0, then the result must be 1
		 * If the input number 'n' is 1, then the result must be 0
		 * DO NOT USE IF-ELSE, SWITCH-CASE, MODULUS, LOOPING, or any other conditional or control statements
		 */
		
		
		
		return result;
	}
	
	public static void main(String arg[]) 
	{
		int n=compliment(0);
		System.out.print("the compliment of given number is :" +n);	
	}
}
