/*
 
 Key Points:
 
 1. This is Binary Search iterative algorithm.
 
 2. Stack Space S(n): 1(Constant)(In Every Case)
 
 3. Time Complexity T(n): log(n)(In Worst Case and Average Case)
			: 1(Constant)(In Best Case)
						
 4. Computer point of view it is better to use iterative algorithm for Binary Search
    than recursive algorithm.
    
 5. Recursive Binary Search program will take more time when compared with Iterative Binary
    Search program. Iterative program will take either equal or less amount of time but never
    more than Recursive Binary Search program.
    
*/

package algorithms;

import java.util.Scanner;

public class BinarySearch_Iterative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the array size: ");
		int n = input.nextInt();
		int[] ar = new int[n];
		System.out.print("Enter the elements: ");
		for(int i=0;i<n;i++) {
			ar[i] = input.nextInt();
		}
		int firstIndex = 0;
		int lastIndex = n-1;
		System.out.print("Enter an element: ");
		int element = input.nextInt();
		int result = binarySearchIterative(ar,firstIndex,lastIndex,element);
		System.out.print("Element found at: "+result+" index");
		input.close();
				
	}

	private static int binarySearchIterative(int[] ar, int i, int j, int x) {
		// TODO Auto-generated method stub
		int mid = 0;
		while(i<=j) {
			if(i==j) {
				if(ar[i]==x)
					return i;
				else {
					return -1;
				}
			}
			else {
				mid = (i+j)/2;
				if(ar[mid]==x) 
					return mid;
				else if(x<ar[mid]) {
					j = mid-1;
				}
				else {
					i = mid+1;
				}
			}
		}
		return -1;
	}
}

/*

Enter the array size: 6
Enter the elements: 1 2 3 4 5 6
Enter an element: 5
Element found at: 4 index

*/
