package com.ds.tree.binarytree.search;

import java.util.LinkedList;
import java.util.Queue;

public class HightOfBinaryTree {

	public static void main(String[] args) {
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		int height = heightOfTree(root);
		System.out.println(height);
		
	}

	private static int heightOfTree(Node root) {

	int height = 0;
    
	Queue<Node> thisLevel = new LinkedList<Node>();
	Queue<Node> nextLevel = new LinkedList<Node>();
	thisLevel.add(root);
	while(null != (root = thisLevel.poll()))
	{
		if(root.left != null)nextLevel.add(root.left);
		if(root.right != null)nextLevel.add(root.right);
		
		if(thisLevel.isEmpty())
		{
			height++;
			//Queue<Node> temp = thisLevel;
			thisLevel = nextLevel;
			nextLevel = new LinkedList<Node>();
			
		}
		
	}	
		return height;
		
	}
	
	
}
