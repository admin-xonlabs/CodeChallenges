public class Challenge5 {

	public static void pattern1(int[][] matrix)
	{
		/*
		 * Traverse the matrix in the pattern 1 explained 
		 * 
		 */
		System.out.print("Pattern 1: ");
		for (int i = 0; i < matrix.length; i++) 
        {
            if (i % 2 == 0) 
            { 
                for (int j = 0; j < matrix[0].length; j++) 
                    System.out.print(matrix[i][j] +" ");
            } 
            else
            { 
                for (int j = matrix[0].length - 1; j >= 0; j--) 
                    System.out.print(matrix[i][j] +" "); 
            } 
        }
		System.out.println();
	}
	
	public static void pattern2 (int [][] matrix)
	{
		/*
		 *  Traverse the matrix in the pattern 2 explained
		 *    
		 */
		System.out.print("Pattern 2: ");
		for (int i = 0; i < matrix.length; i++) 
        {
            if (i % 2 == 0) 
            {
                for (int j = matrix[0].length - 1; j >= 0; j--) 
                    System.out.print(matrix[j][i] +" ");
            } 
            else
            { 
                for (int j = 0; j < matrix[0].length; j++) 
                    System.out.print(matrix[j][i] +" ");
            } 
        }
		System.out.println();
	}
	
	public static void pattern3 (int [][] matrix)
	{
		/*
		 *  Traverse the matrix in the pattern 3 explained
		 *    
		 */
		System.out.print("Pattern 3: ");
		for (int i = 0; i < matrix.length; i++) 
        {
            if (i % 2 == 0) 
            { 
                for (int j = 0; j < matrix[0].length; j++) 
                    System.out.print(matrix[i][j] +" ");
            }
        }
        for (int i = 0; i < matrix.length; i++) 
        {
            if (i % 2 != 0) 
            { 
                for (int j = 0; j < matrix[0].length; j++) 
                    System.out.print(matrix[i][j] +" ");
            }
        }
		System.out.println();
	}

	public static void main(String[] args) 
    { 
        int[][] mat = new int[][] 
        { 
            { 10, 20, 30, 40 }, 
            { 15, 25, 35, 45 }, 
            { 27, 29, 37, 48 }, 
            { 32, 33, 39, 50 } 
        };
        pattern1(mat);
		pattern2(mat);
		pattern3(mat);
    } 
}