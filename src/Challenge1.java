
public class Challenge1 {

	public static int compliment (int n)
	{
		int result = -1;
		
		result=-(n-1);//or -n+1
		
		
		return result;
	}
	
	public static void main(String arg[]) {
int a,b;
		a=compliment (0);
		b=compliment (1);
		System.out.println("compliment of 0 is  "+a);
		System.out.println("compliment of 1 is  "+b);

	}
}
