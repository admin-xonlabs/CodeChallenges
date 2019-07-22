
public class Challenge3 {

	public static int findMaxOccurrence(int arr[],int n)
	{
          	// find the max frequency using linear 
        	// traversal 
        	int max_count = 1, res = arr[0]; 
        	int curr_count = 1; 
          
        	for (int i = 1; i < n; i++) 
        	{ 
            		if (arr[i] == arr[i - 1]) 
                		curr_count++; 
            		else 
            		{ 
                		if (curr_count > max_count) 
                		{ 
                    			max_count = curr_count; 
                    			res = arr[i - 1]; 
                		} 
                		curr_count = 1; 
            		} 
        	} 
		// If last element is most frequent 
        	if (curr_count > max_count) 
        	{ 
            		max_count = curr_count; 
            		res = arr[n - 1]; 
        	} 
		/*
		 * Parse the input array and find out the element with most number of
		 * occurrence.
		 */

		return res;
	}

	public static void main(String arg[]) 
	{
		int arr1[] = { 10, 20, 20, 40, 40, 40, 12, 25 };
		int n1 = arr1.length;
		int res1 = findMaxOccurrence(arr1,n1);
		System.out.println("Most number of occurrences in the first array is : " + res1);

		int arr2[] = { 1, 1, 1, 2, 2, 2 };
		int n2 = arr2.length;
		int res2 = findMaxOccurrence(arr2,n2);
		System.out.println("Most number of occurrences in the second array is : " + res2);

		int arr3[] = { 1, 2, 3, 3, 5, 4 };
		int n3 = arr3.length;
		int res3 = findMaxOccurrence(arr3,n3);
		System.out.println("Most number of occurrences in the third array is : " + res3);

	}
}
