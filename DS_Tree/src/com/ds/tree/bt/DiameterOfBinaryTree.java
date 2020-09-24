package com.ds.tree.bt;

import com.ds.tree.bst.Node;

public class DiameterOfBinaryTree {
	
	public static void main(String[] args) {
		
		Node root = new Node(1000);
		root.left = new Node(6);
		root.left.left = new Node(400);
		root.left.right = new Node(8);
		root.right = new Node(16);
		root.right.left = new Node(14);
		root.right.right = new Node(18);
		root.right.right.left = new Node(15);
		root.right.right.left.left = new Node(12);
		
		
		System.out.println(diameterOfBT(root));
	}

	private static int diameterOfBT(Node root) {

		if(root == null)
			return 0;
		
		int maxDiameter = 0;
		
		int lHeight = getHeight(root.left);
		int rHeight = getHeight(root.right);
		
		int diameter = lHeight+rHeight+1;
		
		if(diameter > maxDiameter)
			maxDiameter = diameter;
		
		return maxDiameter;
	}
	
	
private static int getHeight(Node root) {
        
		if(root == null)
		{
			return 0;
		}
		
		int lHeight =  getHeight(root.left);
		int rHeight =  getHeight(root.right);
		
		if(lHeight > rHeight)
		{
			return lHeight+1;
		}else
			return rHeight+1;
	}

}
