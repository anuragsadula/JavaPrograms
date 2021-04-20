package linkedList;

import java.util.Scanner;

public class RemoveDuplicatesFromSortedList {
	Node head = null;
	class Node{
		Node next;
		int data;
		Node(int new_data){
			data = new_data;
			next = null;
		}
	}
	
	public void addNodes(int new_data) {
		if(head == null) {
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
	
	public Node removeDuplicatesFromSortedList(Node current) {
		Node current = head;
		System.out.print("LinkedList after removing duplicates: ");
		while(temp!=null) {
			Node temp = current;
			if(temp!=null && temp.data==current.data) {
				
				backUp = temp.data;
				temp = temp.next;
			}
			else {
				backUp = temp.data;
				temp = temp.next;
			}
		}
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
		RemoveDuplicatesFromSortedList remove = new RemoveDuplicatesFromSortedList();
		for(int j=0;j<n;j++) {
			remove.addNodes(ar[j]);
		}
		remove.printList();
		remove.removeDuplicatesFromSortedList(remove.head);
		input.close();
	}

}
