package linkedList;

import java.util.Scanner;

public class LengthByRecursive {
	Node head = null;
	int count = 0;
	class Node{
		Node next;
		int data;
		Node(int new_data){
			data = new_data;
			next = null;
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
	
	public int lengthByRecursive(Node temp) {
		if(temp == null) {
			return count;
		}
		count = 1+lengthByRecursive(temp.next);
		return count;
	}

	public void push(int new_data){
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node; 	
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
		System.out.print("Enter the size: ");
		int n = input.nextInt();
		int[] ar = new int[n];
		System.out.print("Enter the elements: ");
		for(int i=0;i<n;i++) {
			ar[i] = input.nextInt();
		}
		LengthByRecursive node = new LengthByRecursive();
		for(int j=0;j<n;j++) {
			node.addNodes(ar[j]);
		}
		node.push(4556);
		node.printList();
		System.out.print("Length of the LinkedList is: ");
		System.out.print(node.lengthByRecursive(node.head));
		input.close();
	}

}
