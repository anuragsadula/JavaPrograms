package linkedList;

import java.util.HashSet;
import java.util.Scanner;

public class LengthOfTheLoop {
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
	
	public int findLengthOfTheLoop(Node current) {
		boolean flag = false;
		Node temp = current;
		Node prev = null;
		current.next.next.next.next.next = current;
		HashSet<Node> hs = new HashSet<>();
		while(temp!=null) {
			if(hs.contains(temp)) {
				flag = true;
				System.out.println("Loop Found!");
				break;
			}
			else {
				hs.add(temp);
				prev = temp;
				temp = temp.next;
			}
		}
		int count = 1;
		if(flag==true) {	
			while(temp!=prev) {
				temp = temp.next;
				count++;
			}
			return count;
		}
		else {
			System.out.println("No Loop found!");
			return 0;
		}
	}
	
	public void printList() {
		Node temp = head;
		System.out.print("Created LinkedList is: ");
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
		LengthOfTheLoop find = new LengthOfTheLoop();
		for(int j=0;j<n;j++) {
			find.addNodes(ar[j]);
		}
		find.printList();
		int loopCount = find.findLengthOfTheLoop(find.head);
		System.out.print("Length of the Loop: "+loopCount);
		input.close();
	}

}
