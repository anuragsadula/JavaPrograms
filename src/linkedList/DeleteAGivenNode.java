package linkedList;

import java.util.Scanner;

public class DeleteAGivenNode {
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
	public void deleteAGivenNode(int key) {
		if(head.data==key) {
			head = head.next;
			//head.next = null;
		}
		else {
			Node prev = head;
			Node temp = head.next;
			while(temp!=null) {
				if(temp.data == key) {
					prev.next = temp.next;
					temp.next = null;
					return;
				}
				else {
					temp = temp.next;
					prev = prev.next;
				}
			}
			System.out.println("There is no such node to delete");
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
		
		DeleteAGivenNode node = new DeleteAGivenNode();
		
		for(int j=0;j<n;j++) {
			node.addNodes(ar[j]);
		}
		node.printList();
		System.out.print("Enter any element of the LinkedList to delete: ");
		int delete = input.nextInt();
		node.deleteAGivenNode(delete);
		node.printList();
		input.close();
	}

}
