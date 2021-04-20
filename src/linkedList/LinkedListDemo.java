package linkedList;


public class LinkedListDemo {
	Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public void printList() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListDemo ll = new LinkedListDemo();
		ll.head = new Node(1);
		Node second = new Node(23);
		Node third = new Node(45);
		
		ll.head.next = second;
		second.next = third;
		
		ll.printList();
	}

}
