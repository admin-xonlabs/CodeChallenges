import java.util.Arrays; 
public class Challenge3 {

 public static int findMaxOccurrence(int[] numbers) {
    int n=numbers.length;	    
 
    boolean visited[] = new boolean[n]; 
      
    Arrays.fill(visited, false); 
  
    // Traverse through array elements and 
    // count frequencies 
    for (int i = 0; i < n; i++) { 
  
        // Skip this element if already processed 
        if (visited[i] == true) 
            continue; 
  
        // Count frequency 
        int count = 1; 
        for (int j = i + 1; j < n; j++) { 
            if (numbers[i] == numbers[j]) { 
                visited[j] = true; 
                count++; 
            } 
        } 
        System.out.println(numbers[i] + " " + count); 
    } return n;
 
	}

	public static void main(String arg[]) {
		int numbers1[] = { 10, 20, 20, 40, 40, 40, 12, 25 };
		int res1 = findMaxOccurrence(numbers1);
		System.out.println("Most number of occurrences in the first array is : " + res1);

		int numbers2[] = { 1, 1, 1, 2, 2, 2 };
		int res2 = findMaxOccurrence(numbers2);
		System.out.println("Most number of occurrences in the second array is : " + res2);

		int numbers3[] = { 1, 2, 3, 3, 5, 4 };
		int res3 = findMaxOccurrence(numbers3);
		System.out.println("Most number of occurrences in the third array is : " + res3);

	}
}