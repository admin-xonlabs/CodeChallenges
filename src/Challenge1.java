public class Challenge1 {

	public static int compliment (int n)
	{
		int result = -1;
		/*
		 * Complete this method
		 * If the input number 'n' is 0, then the result must be 1
		 * If the input number 'n' is 1, then the result must be 0
		 * DO NOT USE IF-ELSE, SWITCH-CASE, MODULUS, LOOPING, or any other conditional or control statements
		 */
		result = n>0? 0 : 1;
		return result;
	}
	
	public static void main(String arg[]) 
	{
		int a = compliment(1);
		System.out.println(a);
	}
}
