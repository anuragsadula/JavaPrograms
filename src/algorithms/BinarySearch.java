/*

	Binary Search algorithm works for sorted array only.
	
	Time Complexity: Theta(log(n))  (In Worst Case)
	  	       : O(1)(Constant) (In Best Case)
*/

package algorithms;

import java.util.Scanner;

public class BinarySearch {
	private static int binarySearch(int[] ar,int i,int j,int element) {
		if(i==j) {
			if(ar[i]==element) {
				return i;
			}
			else
				return -1;
		}
		else {
			int mid = (i+j)/2;
			
			if(ar[mid]==element)
				return mid;
			else if(ar[mid]>element)
				return binarySearch(ar, i, mid-1, element);
			else
				return binarySearch(ar, mid+1, j, element);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = input.nextInt();
		int[] ar = new int[n];
		System.out.print("Enter the elements: ");
		for(int i =0;i<n;i++) {
			ar[i] = input.nextInt();
		}
		System.out.print("Enter an element: ");
		int startIndex = 0;
		int endIndex = n-1;
		int element = input.nextInt();
		int result = binarySearch(ar,startIndex,endIndex,element);
		System.out.print("Element found at: "+result+" index");
		input.close();
	}
}

/*

Enter the size of the array: 10
Enter the elements: 1 5 7 14 69 70 88 90 111 200
Enter an element: 111
Element found at: 8 index 

*/
