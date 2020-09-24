package com.ds.tree.bst;

public class ShortestPathBetweenNodes {
	
	
	public static void main(String[] args) {
		
		Node root = new Node(5);
		root.left = new Node(2);
		root.left.left = new Node(1);
		root.left.right = new Node(3);
		root.right = new Node(12);
		root.right.left = new Node(9);
		root.right.right = new Node(21);
		root.right.right.left = new Node(19);
		root.right.right.right = new Node(25);
		
		
		int nodeDistance = findPathBetweenNodes( root.left.left, root.right.right.left, root);	
		
		System.out.println(nodeDistance);
		
	}

	private static int findPathBetweenNodes(Node left, Node right, Node root) {
		
		if(right.value == root.value || left.value == root.value)
		{
			if(root.value == right.value)
			{
			    return findDistanceFromRoot(root, left);
			}else
			{
				return findDistanceFromRoot(root, right);
			}
		}else if(right.value > root.value && left.value > root.value)
		{
			return findPathBetweenNodes(left, right, root.right);			
		}else if (right.value < root.value && left.value < root.value)
		{
			return findPathBetweenNodes(left, right, root.left);
		}else if(right.value > root.value && left.value < root.value)
		{
			int leftD = findDistanceFromRoot(root,left);
			int rightD = findDistanceFromRoot(root,right);
			
			return leftD+rightD;
		}	
		
		return 0;
		// TODO Auto-generated method stub
		
	}

	private static int findDistanceFromRoot(Node root, Node left) {

		int count = 0;
		if(root ==  null || left == null)
		{
			return 0;
		}		
		while(root.value != left.value)
		{
			if(root.value > left.value)
			{
				root = root.left;
				count++;
			}else if(root.value < left.value)
			{
				root = root.right;
				count++;
			}		
			
		}
		
		return count;
	}
	
	

}
