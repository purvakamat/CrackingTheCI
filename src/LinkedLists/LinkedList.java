package LinkedLists;
import java.util.Scanner;

/**
 * Created by kamat on 9/27/2016.
 */
public class LinkedList {
	Node head;
	Node tail;

	public LinkedList() {
		head = null;
		tail = null;
	}

	public void appendToTail(int data) {
		Node n = new Node(data);

		if(head == null)
			head = n;
		if(tail != null)
			tail.setNext(n);

		tail = n;
	}

	public void display() {
		Node node = head;
		while(node.getNext() != null) {
			System.out.print(node.getData() + " ");
			node = node.getNext();
		}
		System.out.print(node.getData() + "\n");
	}

	public void deleteNode(int data) {
		Node node = head;
		Node prev = null;
		boolean found = false;
		while(node != null){
			if(node.getData() == data){
				found = true;
				break;
			}
			else {
				prev = node;
				node = node.getNext();
			}
		}

		if(found) {
			if(prev != null)
				prev.setNext(node.getNext());
			node = null;
		}
	}

	public Node getHead(){
		return head;
	}
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		LinkedList l = new LinkedList();
		for (int i=0;i<n;i++) {
			l.appendToTail(scan.nextInt());
		}
		l.display();
		n = scan.nextInt();
		l.deleteNode(n);
		l.display();
	}
}

class Node {
	int data;
	Node next;

	public Node(int d) {
		data = d;
		next = null;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node n) {
		next = n;
	}

	public int getData(){
		return data;
	}
}
