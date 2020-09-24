package com.ds.tree.bst;

import java.util.LinkedList;
import java.util.Queue;

public class CheckBTIsBST {
	
	
	public static void main(String[] args) {
		
		Node root = new Node(10);
		root.left = new Node(6);
		root.left.left = new Node(4);
		root.left.right = new Node(8);
		root.right = new Node(16);
		root.right.left = new Node(11);
		root.right.right = new Node(18);
		
		boolean isBst = checkIsBST(root);
		System.out.println(isBst);
		
	}

	private static boolean checkIsBST(Node root) {
		boolean isLeftBst, isRightBst;
		
		if(root.left != null)
		{
			isLeftBst = checkBst(root.left , true , root.value);
		}else
			isLeftBst = true;
		
		if(root.right != null)
		{
			isRightBst = checkBst(root.right , false, root.value);
		}else
			isRightBst = true;
		
		if(isLeftBst && isRightBst)
		{
			return true;
		}else 
			return false;		
	}

	
	private static boolean checkBst(Node root,boolean checkLeft, int data)
	{
		boolean isBst = true;
		if(root == null)
		{
			return true;
		}
		
	    Queue<Node> q = new LinkedList<Node>();
	    q.add(root); 
		
		
		while(!q.isEmpty())
		{
			Node temp = q.poll();
			if(checkLeft && temp.value < data)
			{
				isBst = true;
			}else if(!checkLeft && temp.value > data)
			{
				isBst = true;
			}else
				return false;
			
			if(temp.left != null && temp.value > temp.left.value)
			{
				q.add(temp.left);
				isBst = true;
			}else if(temp.left == null)
			{
				isBst = true;
			}else
				return false;
			
			
			if(temp.right != null && temp.value < temp.right.value)
			{
				q.add(temp.right);
				isBst = true;
			}else if(temp.right == null)
			{
				isBst = true;
			}else
			  return false;
			
		}
		return isBst;
		
		
	}
}
