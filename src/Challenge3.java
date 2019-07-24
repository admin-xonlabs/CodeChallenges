
public class Challenge3 {

	public static int findMaxOccurrence(int a[], int n) {
		int ele=a[0],max=0,cur=0,i;
		for(i=0;i<n;i++)
		{
			if(a[i]==ele)
				cur++;
			else
			{
				if(cur>max)
				{
					max=cur;
					ele=a[i-1];
				}
				cur=1;
			}
		}
		if(cur>max)
		{
			max=cur;
			ele=a[n-1];
		}

		/*
		 * Parse the input array and find out the element with most number of
		 * occurrence.
		 */

		return ele;
	}

	public static void main(String arg[]) {
		int arr1[] = { 10, 20, 20, 40, 40, 40, 12, 25 };
		int n1=arr1.length;
		int res1 = findMaxOccurrence(arr1,n1);
		System.out.println("Most number of occurrences in the first array is : " + res1);

		int arr2[] = { 1, 1, 1, 2, 2, 2 };
		int n2=arr2.length;
		int res2 = findMaxOccurrence(arr2,n2);
		System.out.println("Most number of occurrences in the second array is : " + res2);

		int arr3[] = { 1, 2, 3, 3, 5, 4 };
		int n3=arr3.length;
		int res3 = findMaxOccurrence(arr3,n3);
		System.out.println("Most number of occurrences in the third array is : " + res3);

	}
}
