package linkedList;

import java.util.HashSet;
import java.util.Scanner;

public class DetectLoopInList {
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
		else{
			Node new_node = new Node(new_data);
			Node temp = head;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = new_node;
		}
	}
	
	public boolean detectLoop(Node current) {
		HashSet<Node> add = new HashSet<Node>();
		current.next.next.next.next = current;
		while(current!=null) {
			if(add.contains(current)) {
				return true;
			}
			else {
				add.add(current);
				current = current.next;
			}
		}
		return false;
	}
	
	public void printList(){
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
		DetectLoopInList node  = new DetectLoopInList();
		for(int j=0;j<n;j++) {
			node.addNodes(ar[j]);
		}
		node.printList();
		
		if(node.detectLoop(node.head))
			System.out.print("Loop Found!");
		else
			System.out.print("No Loop!");
		input.close();
	}

}
