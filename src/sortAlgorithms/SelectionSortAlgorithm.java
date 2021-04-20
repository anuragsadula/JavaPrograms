/*
 	The algorithm finds the minimum value, swaps it with the value in the
	first position, and repeats these steps for the remainder of the list. It does no more than
	n swaps, and thus is useful where swapping is very expensive.
	
	-->Time Complexity: O (n2)
	
*/
package sortAlgorithms;

import java.util.Scanner;

public class SelectionSortAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = input.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<n;i++) {
			ar[i] = input.nextInt();
		}
		
		
		
		for(int j=0;j<n-1;j++) {
			int min_idx = j;
			for(int k=j+1;k<n;k++) {
				if(ar[k]<ar[min_idx]) {
					min_idx = k;
				}
			}
			int temp = ar[min_idx];
			ar[min_idx] = ar[j];
			ar[j] = temp;
		}
		
		
		
		System.out.println("Array after sorting: ");
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
 Array after sorting: 
 1 2 3 4 5 6 7 8 9 10 

*/