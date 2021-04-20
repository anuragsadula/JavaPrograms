package linkedList;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeOrNot {
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
		else{
			Node new_node = new Node(new_data);
			Node temp = head;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = new_node;
		}
	}
	
	public void palindromeOrNot(Node current) {
		Node temp = current;
		Stack<Integer> s = new Stack<>();
		while(temp!=null) {
			s.push(temp.data);
			temp = temp.next;
		}
		
		boolean b = true;
		while(current!=null) {
			if(current.data==s.pop()) {
				b = true;
			}
			else {
				b = false;
				break;
			}
			current = current.next;
		}
		if(b==true) {
			System.out.print("LinkedList is a Palidrome!");
		}
		else {
			System.out.print("LinkedList is not a Palindrome!");
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
		PalindromeOrNot find = new PalindromeOrNot();
		for(int j=0;j<n;j++) {
			find.addNodes(ar[j]);
		}
		find.printList();
		find.palindromeOrNot(find.head);
		input.close();
		
	}

}
