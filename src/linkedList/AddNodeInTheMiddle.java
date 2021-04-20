package linkedList;

import java.util.Scanner;

public class AddNodeInTheMiddle {
	Node head = null;
	static class Node{
		Node next;
		int data;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public void addNodes(int new_data) {
		if(head==null) {
			head = new Node(new_data);
		}
		else{
			Node new_node = new Node(new_data);
			Node temp = head;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = new_node;
		}
	}
	
	public Node addNodeInTheMiddle(int position, int new_data) {
		Node prev = head;
		Node forward = head.next;
		Node new_node = new Node(new_data);
		int flag = 1;
		if(position == flag) {
			new_node.next = prev;
			head = new_node;
			return head;
		}
		flag = 2;
		while(forward!=null) {
			if(position == flag) {
				new_node.next = prev.next;
				prev.next = new_node;
				break;
			}
			else {
				prev = prev.next;
				forward = forward.next;
				flag++;
			}
		}
		if(forward==null) {
			prev.next = new_node;
			forward = new_node;
			return head;
		}
		return head;
	}
	
	public void printList(Node head) {
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
		
		AddNodeInTheMiddle add = new AddNodeInTheMiddle();
		for(int j=0;j<n;j++) {
			add.addNodes(ar[j]);
		}
		add.printList(add.head);
		System.out.print("Enter the position to insert in the LinkedList: ");
		int insert = input.nextInt();
		System.out.print("Enter the element to insert in that position: ");
		int element = input.nextInt();
		add.addNodeInTheMiddle(insert, element);
		add.printList(add.head);
		input.close();
	}

}
