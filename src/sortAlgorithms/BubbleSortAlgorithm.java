/*
 	
 	The algorithm starts at the beginning of the data set. It compares the
	first two elements, and if the first is greater than the second, it swaps them. It
	continues doing this for each pair of adjacent elements to the end of the data set. It
	then starts again with the first two elements, repeating until no swaps have occurred
	on the last pass.
	
	-->Time Complexity: O(n^2)

*/


package sortAlgorithms;

import java.util.Scanner;

public class BubbleSortAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the array size: ");
		int n = input.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<n;i++) {
			ar[i] = input.nextInt();
		}
		
		
		for(int j=0;j<n-1;j++) {
			for(int k=0;k<n-j-1;k++) {
				if(ar[k]>ar[k+1]) {
					int temp = ar[k];
					ar[k] = ar[k+1];
					ar[k+1] = temp;
				}
			}
		}
		
		
		System.out.print("Array after sorting: ");
		for(int r=0;r<n;r++) {
			System.out.print(ar[r]+" ");
		}
	}

}

/*

OUTPUT:

Enter the array size: 10
10 9 8 7 6 5 4 3 2 1
Array after sorting: 1 2 3 4 5 6 7 8 9 10 

*/