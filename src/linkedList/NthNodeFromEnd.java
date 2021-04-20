package linkedList;

import java.util.Scanner;

public class NthNodeFromEnd {
	Node head;
	
	class Node{
		int data;
		Node next;
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
				temp  =temp.next;
			}
			temp.next = new_node;
		}
	}
	
	public Node reverseTheList(Node node) {
		Node previous = null;
		Node current = node;
		Node next = null;
		while(current!=null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		node = previous;
		return node;
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
	
	public void printNthNode(Node head, int position) {
		int count = 1;
		Node temp = head;
		int result = 0;
		while(temp!=null) {
			if(count==position) {
				result = temp.data;
				break;
			}
			else {
				temp = temp.next;
				count++;
			}
		}
		if(result==0)
			System.out.print("Entered position is out of bounds.");
		else
			System.out.print("Nth node from the end is: "+result);
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
		NthNodeFromEnd node = new NthNodeFromEnd();
		for(int j=0;j<n;j++) {
			node.addNodes(ar[j]);
		}
		node.printList();
		node.head = node.reverseTheList(node.head);
		System.out.print("Enter the position of a node from the end: ");
		int position = input.nextInt();
		node.printNthNode(node.head, position);
		input.close();
	}
}
