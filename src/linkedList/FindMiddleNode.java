package linkedList;

import java.util.Scanner;

public class FindMiddleNode {
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
	
	public void findMiddleNode(int length) {
		int middleNodeCount = 0;
		int count = 1;
		if(length%2==0) {
			middleNodeCount = length/2+1;
		}
		else {
			middleNodeCount = length/2+1;
		}
		Node temp = head;
		int result = 0;
		while(temp!=null) {
			if(middleNodeCount==count) {
				result = temp.data;
				break;
			}
			else {
				temp = temp.next;
				count++;
			}
		}
		System.out.print("Middle Node is: "+result);
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
		FindMiddleNode node = new FindMiddleNode();
		for(int j=0;j<n;j++) {
			node.addNodes(ar[j]);
		}
		node.printList();
		node.findMiddleNode(n);
		input.close();
	}

}
