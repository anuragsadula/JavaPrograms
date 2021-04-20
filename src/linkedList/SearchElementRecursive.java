package linkedList;

import java.util.Scanner;

public class SearchElementRecursive {
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
		else{
			Node new_node = new Node(new_data);
			Node temp = head;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = new_node;
		}
	}
	
	public void searchAnElement(Node temp, int searchElement, int position) {
		if(temp==null) {
			System.out.print("Element "+searchElement+" not found in LinkedList.");
		}
		else {
			if(temp.data == searchElement) {
				System.out.print("Element "+searchElement+" Found at "+position+" position.");
			}
			else {
				position++;
				searchAnElement(temp.next, searchElement, position);
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
		
		SearchElementRecursive element = new SearchElementRecursive();
		for(int j=0;j<n;j++) {
			element.addNodes(ar[j]);
		}
		element.printList();
		System.out.print("Enter an element to search in LinkedList: ");
		int search = input.nextInt();
		int position = 1;
		element.searchAnElement(element.head, search, position);
		input.close();
	}
}
