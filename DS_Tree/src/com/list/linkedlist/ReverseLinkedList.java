package com.list.linkedlist;

public class ReverseLinkedList {
	public static Node head = null;
	
	public static void main(String[] args) {
		
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		
		head = n1;
		
		
		printLinkedList(head);
		
		reverseALinkedList(head);
		
		printLinkedList(head);
		
		
	}
	
	public static void printLinkedList(Node head){
		
		while(head != null)
		{
			System.out.println(head.value+ " ");
			head = head.next;
		}
		
	}
	
	public static void reverseALinkedList(Node node){
		
		Node prev = null;
		Node current = node;
		
		while(current != null)
		{
			Node temp = current.next;	
			current.next = prev;
			prev = current;
			current = temp;		
		}
		
		head = prev;
	}

}
