package com.ds.tree.bt;

import java.util.LinkedList;
import java.util.Queue;

import com.ds.tree.bst.Node;

public class SizeOfBinaryTree {
	
	public static void main(String[] args) {
		
		Node root = new Node(1000);
		root.left = new Node(6);
		root.left.left = new Node(400);
		root.left.right = new Node(8);
		root.right = new Node(16);
		root.right.left = new Node(14);
		root.right.right = new Node(18);
		
		System.out.println(sizeOfBinaryTree(root));	
		System.out.println(sizeOfBinaryTreeNR(root));	
		
	}

	private static int sizeOfBinaryTreeNR(Node root) {
		
		int size =0;
		Queue<Node> q = new LinkedList<Node>();
		q.offer(root);
		
		while(!q.isEmpty())
		{
			Node temp = q.poll();
			size++;
			
			if(temp.left != null)
			{
				q.offer(temp.left);
			}
			if(temp.right != null)
			{
				q.offer(temp.right);
			}
		}
		
		return size;
	}

	private static int sizeOfBinaryTree(Node root) {
        
		if(root == null)
		{
			return 0;
		}
		
		int lsize = sizeOfBinaryTree(root.left);
		int rsize = sizeOfBinaryTree(root.right);
		
		return lsize+rsize+1;
	}
	
	

}
