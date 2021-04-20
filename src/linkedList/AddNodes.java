package linkedList;

import java.util.Scanner;

public class AddNodes {
	Node head = null;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	public void addToTheLast(int new_data) {
		if(head == null) {
			head = new Node(new_data);
		}
		else {
			Node temp = head;
			Node new_node = new Node(new_data);
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = new_node;
		}
	}
	public void printList() {
		System.out.print("Created LinkedList is: ");
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
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
		
		AddNodes add = new AddNodes();
		for(int j=0;j<n;j++) {
			add.addToTheLast(ar[j]);
		}
		
		add.printList();
		input.close();
	}

}
