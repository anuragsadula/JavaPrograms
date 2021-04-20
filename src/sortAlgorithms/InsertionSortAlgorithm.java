/*
	Insertion Sort: This works by taking elements from the list one by one and inserting
	them in their correct position into a new sorted list. In arrays, the new list and the
	remaining elements can share the array's space, but insertion is expensive, requiring
	shifting all following elements over by one.
	
	->Time Complexity: O (n2)
	
*/
package sortAlgorithms;

import java.util.Scanner;

public class InsertionSortAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = input.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<n;i++) {
			ar[i] = input.nextInt();
		}
		
		
		
		for(int k=1;k<n;k++) {
			int currElement = ar[k];
			int j = k-1;
			while(j>=0 && ar[j]>currElement) {
				ar[j+1] = ar[j];
				j--;
			}
			ar[j+1] = currElement;
		}
		
		
		System.out.print("Array After Sorting: ");
		for(int r=0;r<n;r++) {
			System.out.print(ar[r]+" ");
		}
		input.close();
	}

}
/*

OUTPUT:

Enter the size of the array: 10
10 9 8 7 6 5 4 3 2 1
Array After Sorting: 1 2 3 4 5 6 7 8 9 10 

*/

