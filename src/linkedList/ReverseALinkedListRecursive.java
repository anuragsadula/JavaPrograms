package linkedList;

import java.util.Scanner;

public class ReverseALinkedListRecursive {
	Node head = null;
	Node prev = null;
	Node current = head;
	Node next = null;
	int count = 1;
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
	
	public Node reverseLinkedListRecursive(Node current) {
		if(current == null)
			return head;
		
		next = current.next;
		current.next = prev;
		prev = current;
		current = next;
		reverseLinkedListRecursive(current);
		head = prev;
		return head;
	}
	
	public void printList() {
		if(count == 1) {
			System.out.print("Created LinkedList is: ");
		}
		else {
			System.out.print("Reversed LinkedList is: ");
		}
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		count++;
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
		ReverseALinkedListRecursive node = new ReverseALinkedListRecursive();
		for(int j=0;j<n;j++) {
			node.addNodes(ar[j]);
		}
		node.printList();
		node.reverseLinkedListRecursive(node.head);
		node.printList();
		
		input.close();
		
	}

}
