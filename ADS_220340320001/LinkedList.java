
import java.util.*;
class LinkedList{
	static Node head;
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	Node reverse(Node n){
		Node temp = n;
		Node prev = null;
		Node next = null;
		
		while(temp != null){
			next = temp.next;
			temp.next = prev;
			prev = temp;
			temp = next;
		}
		n = prev;
		return n;
	}
	void print(Node n){
		while(n != null){
			System.out.print(n.data+" ");
			n = n.next;
		}
	}
	
	/*
	void insertEnd(int d){
		Node new_node = new Node(d);
		if(head == null){
			head = new_node;
			return;
		}
		new_node.next = null;
		Node n = head;
		while(n.next != null){
			n = n.next;
		}
		n.next = new_node;
		return;
	}*/
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		//System.out.println("Test case ");
		int t = sc.nextInt();
		//System.out.println("No of element in linked list ");
		int n = sc.nextInt();
		LinkedList ll = new LinkedList();
		/*ll.head = new Node(1);
		ll.head.next = new Node(2);
		ll.head.next.next = new Node(3);
		ll.head.next.next.next = new Node(4);
		ll.head.next.next.next.next = new Node(5);
		ll.print(head);
		System.out.println();
		head = ll.reverse(head);
		ll.print(head);
		*/
		
		ll.head = new Node(3);
		ll.head.next = new Node(4);
		ll.head.next.next = new Node(2);
		ll.head.next.next.next = new Node(5);
		ll.print(head);
		System.out.println();
		head = ll.reverse(head);
		ll.print(head);
		
	}
}