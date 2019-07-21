
public class Challenge3 {

	public static int findMaxOccurrence(int[] numbers) {
		int element=0,max=0,count=0;
		for(int i=0;i<numbers.length;i++)
		{
			count=0;
			for(int j=0;j<numbers.length;j++)
			{
				if(numbers[i]==numbers[j])
				{
					count++;
				}
			}
			if(max<count)
			{
				max=count;
				element=numbers[i];
			}
		}
		
		/*
		 * Parse the input array and find out the element with most number of
		 * occurrence.
		 */

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