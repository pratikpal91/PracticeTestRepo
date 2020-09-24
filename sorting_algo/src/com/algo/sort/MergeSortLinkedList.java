package com.algo.sort;


public class MergeSortLinkedList {
	
	public static void main(String[] args) {
		
		Node n1 = new Node(5);
		Node n2 = new Node(7);
		Node n3 = new Node(3);
		Node n4 = new Node(8);
		Node n5 = new Node(2);
		Node n6 = new Node(1);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		
	    Node head = mergeSort(n1);
	    
	    while(head != null)
	    {
	    	System.out.println(head.value);
	    	head = head.next;
	    }
		
	}
	
	public static Node mergeSort(Node node){
		
		if(node == null || node.next == null)
		{
			return node;
		}
		
		Node middle = getMiddle(node);	
		Node middleNext = middle.next;
		middle.next = null;
		
		Node first = mergeSort(node);
		Node second = mergeSort(middleNext);
		
		Node sortedList = merge(first,second);
		return sortedList;
		
	}

	private static Node getMiddle(Node node) {
		
		if(node == null || node.next == null)
		{
			return node;
		}
		Node pt1 = node;
		Node pt2 = node.next;
		while(pt2 != null && pt2.next != null)
		{
			pt1 = pt1.next;
			pt2 = pt2.next.next;
		}		
		return pt1;
	}
	
	
	private static Node merge(Node first,Node second)
	{
		Node node = new Node(0);
		Node finalList = node;
		while(first != null && second != null)
		{
		 if(first.value >= second.value)
		 {
			 node.next = second;
			 second = second.next;
			 node = node.next;
			 
		 }else{
			 
			 node.next = first;
			 first = first.next;	
			 node = node.next;
		 }		 
			 
		}
		while(first != null)
		{
			node.next = first;
			first=first.next;
			node = node.next;
		}
		while(second != null)
		{
			node.next = second;
			second=second.next;
			node = node.next;
		}
		
		return finalList.next;
		
	}
	

}
