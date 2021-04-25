package algorithms;

import java.util.Scanner;

public class Straight_MAX_MIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = input.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<n;i++) {
			ar[i] = input.nextInt();
		}
		
		int max, min;
		max = min = ar[0];
		
		for(int j=1;j<n;j++) {
			if(max<ar[j])
				max = ar[j];
			else {
				if(min>ar[j]) {
					min = ar[j];
				}
			}
		}
		
		System.out.println("Maximum element is: "+max+" and minimum element is: "+min);
		input.close();
	}

}
