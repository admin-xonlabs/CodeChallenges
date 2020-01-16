
public class Challenge3 {

	public static int findMaxOccurrence(int[] numbers) {
		Arrays.sort(numbers);
int m=1,res=numbers[0];
int c=1;
for(int i=1;i<numbers.lenght;i++)
{
if(numbers[i]==numbers[i-1])
c++;

else
{
if(c>m)
{
m=c;
res=numbers[i-1];
}
c=1;
}
}
if(c>m)
{
m=c;
res=numbers[numbers.lenght-1];
}
return res;
}
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
