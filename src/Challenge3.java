
public class Challenge3 {

		public static int findMaxOccurrence(int[] numbers) {
		int element = -1;
		int unilen;
		int[] uniq=new int[numbers.length];
		
		uniq[0]=numbers[0];
		unilen=0;
		for(int i=0;i<numbers.length;i++)
		{
			for(int j=0;j<=unilen;j++)
			{
				if(numbers[i]==uniq[j])
				{
					break;
				}
				else
				{
				if(j==unilen)
				{
					uniq[j+1]=numbers[i];
					unilen++;
					
				}
				}
			}
		}
		int[] occ=new int[unilen+1];
		
		for(int i=0;i<=unilen;i++)
		{
			
			for(int j=0;j<numbers.length;j++)
			{
				
				if(uniq[i]==numbers[j])
				{
					occ[i]++;
					
					
				}
			}
		
		}
int big=occ[0];
		for(int i=0;i<=unilen;i++)
		{
			if(occ[i]>big)
			{
				big=occ[i];
			}
		}
		System.out.println("element is");
		for(int i=0;i<=unilen;i++)
		{
			if(occ[i]==big)
			{
				System.out.println(uniq[i]+"and repeated for "+big+"times");
			}
		}
element=big;
		return element;
	}
	public static void main(String arg[]) {
		int arr1[] = { 10, 20, 20, 40, 40, 40, 12, 25 };
		int res1 = findMaxOccurrence(arr1);
		System.out.println("Most number of occurrences in the first array is : " + res1);

		int arr2[] = { 1, 1, 1, 2, 2, 2 };
		int res2 = findMaxOccurrence(arr2);
		System.out.println("Most number of occurrences in the second array is : " + res2);

		int arr3[] = { 1, 2, 3, 3, 5, 4 };
		int res3 = findMaxOccurrence(arr3);
		System.out.println("Most number of occurrences in the third array is : " + res3);

	}
}
