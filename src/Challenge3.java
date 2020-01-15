
public class Challenge3 {

	public static int findMaxOccurrence(int[] arr,int size) {

		/*
		 * Parse the input array and find out the element with most number of
		 * occurrence.
		 */
		 
		 int counter = 0;
    int max = 0;
     
    int index_max = 0; //to store the index of maximum duplicated element
     
    int i,j;
    for(i=0;i<size;i++)
    {
        counter = 0;
        for(j=0;j<size;j++)
        {
            //check for duplicates in the array
            if(arr[i] == arr[j])
                counter++;
        }
        //update the counter and max_index
        if(counter > max)
        {
            max = counter;
            index_max = i;
        }
    }
     
    //return the maximum duplicated element
    return arr[index_max];
	
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
