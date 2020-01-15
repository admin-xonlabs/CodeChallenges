public class Challenge1 {

	public static int compliment (int n)
	{
		int result = -1;
		
		result=1-n;	
		return result;
	}
	
	public static void main(String arg[])
	{
        Scanner input = new Scanner(System.in);
		System.out.println("enter 0 or 1");
		int result = input.nextInt(); 
		System.out.println("compliment of "+result+" is "+compliment(result));
	}
}
