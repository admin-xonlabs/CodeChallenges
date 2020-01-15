
public class Challenge2 {

	public static double nCr(int n, int r) {
		double result = 0;


		result= (factorial(n))/(factorial(n-r)*factorial(r));

		return result;
	}

	public static double nPr(int n, int r) {
		double result = 0;

		result= (factorial(n))/factorial(n-r);


		return result;
	}

	public static double factorial(int n) {
		double result = 1;

		/*
		 * Complete this method to calculate the factorial of an input number 'n'
		 */
		for (int i = 2; i <= n; i++) 
        result = result * i; 

		return result;
	}

	public static void main(String arg[]) {

		double res1 = factorial(2);
		System.out.println("Factorial of 2 is : " + res1);

		double res2 = factorial(4);
		System.out.println("Factorial of 140 is : " + res2);

		double res3 = factorial(6);
		System.out.println("Factorial of 6 is : " + res3);

		double res4 = factorial(8);
		System.out.println("Factorial of 8 is : " + res4);

		double res5 = nCr(5, 2);
		System.out.println("5C2 : " + res5);

		double res6 = nCr(6, 4);
		System.out.println("6C4 : " + res6);

		double res7 = nPr(5, 2);
		System.out.println("5P2 : " + res7);

		double res8 = nPr(6, 4);
		System.out.println("6P4 : " + res8);

	}
}
