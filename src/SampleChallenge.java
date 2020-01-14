
public class SampleChallenge 
{
	public static double mPowerN(int m, int n) 
	{
		double result = 1;
		/*
		 * Complete this method to return the value of mPowerN. Note: Do not use
		 * Math.pow() method.
		 */
		for(int i = 0; i < n; i++)
		{
			result *= m;
		}
		return result;
	}

	public static void main(String[] args)
	{
		double res1 = mPowerN(10, 2);
		System.out.println("10 power 2 : " + res1);

		double res2 = mPowerN(5, 3);
		System.out.println("5 power 3 : " + res2);

		double res3 = mPowerN(4, 4);
		System.out.println("4 power 4 : " + res3);
	}
}
