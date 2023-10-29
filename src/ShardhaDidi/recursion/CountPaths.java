package ShardhaDidi.recursion;

public class CountPaths {
	
	/*
	 * Count Total Paths in a maze to move from (0,0) to (n,m)
	 * 
	 * */
	
	public static int countPaths(int i, int j, int m, int n)
	{
       if(i == m-1 || j == n-1) {
           return 1;
       }

       // Downwoards Paths
       //int down = countPaths(i+1, j, m, n);
       
	   // Right Side
	   //int right = countPaths(i, j+1, m, n);
    		   
	   return countPaths(i+1, j, m, n) + countPaths(i, j+1, m, n);
   }

   public static void main(String args[]) {
       int m = 3, n = 3;
       System.out.println(countPaths(0, 0, m, n));
   }
}
