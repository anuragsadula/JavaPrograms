package linkedList;

import java.util.Scanner;

public class OccurenceOfANumber {
	Node head = null;
	class Node{
		Node next;
		int data;
		Node(int new_data){
			next = null;
			data = new_data;
		}
	}
	
	public void addNodes(int new_data) {
		if(head==null) {
			head = new Node(new_data);
		}
		else {
			Node new_node = new Node(new_data);
			Node temp = head;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = new_node;
		}
	}
	
	public void occurenceOfAnInteger(int key) {
		int count = 0;
		Node temp = head;
		while(temp!=null) {
			if(temp.data == key) {
				count++;
				temp = temp.next;
			}
			else {
				temp = temp.next;
			}
		}
		System.out.print("Occurence of the entered integer in the List is: "+count);
	}
	
	public void printList() {
		System.out.print("Created LinkedList is: ");
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of the LinkedList: ");
		int n = input.nextInt();
		int[] ar = new int[n];
		System.out.print("Enter the elements: ");
		for(int i=0;i<n;i++) {
			ar[i] = input.nextInt();
		}
		OccurenceOfANumber num = new OccurenceOfANumber();
		for(int j=0;j<n;j++) {
			num.addNodes(ar[j]);;
		}
		num.printList();
		System.out.print("Enter an integer from the List to know it's occurence: ");
		int search_for = input.nextInt();
		num.occurenceOfAnInteger(search_for);;
		input.close();
	}

}
