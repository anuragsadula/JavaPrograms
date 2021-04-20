package linkedList;

import java.util.Scanner;

public class SearchElementIterative {
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
	
	public String searchAnElement(int searchElement) {
		int position = 1;
		String result = "";
		Node temp = head;
		while(temp!=null) {
			if(temp.data==searchElement) {
				result = "Element "+searchElement+" Found at "+position+" position.";
				break;
			}
			else {
				temp = temp.next;
				position++;
			}
		}
		if(result!="") {
			return result;
		}
		else {
			return "Element "+searchElement+" not found in LinkedList.";
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
		
		SearchElementIterative element = new SearchElementIterative();
		for(int j=0;j<n;j++) {
			element.addNodes(ar[j]);
		}
		element.printList();
		
		System.out.print("Enter an element to search in LinkedList: ");
		int search = input.nextInt();
		System.out.print(element.searchAnElement(search));
		input.close();
	}
}
