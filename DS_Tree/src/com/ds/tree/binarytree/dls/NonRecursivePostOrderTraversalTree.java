package com.ds.tree.binarytree.dls;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Node {
	
	Node left,right;
	int value;
	
	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	Node(int item){
		this.value = item;
		this.left = null;
		this.right = null;
		
		
	}
}

public class NonRecursivePostOrderTraversalTree {
	
	public static void main(String[] args) {
		
		Node root = new Node(1);
		Node val1 = new Node(2);
		Node val2 = new Node(3);
		Node val3 = new Node(4);
		Node val4 = new Node(5);
		Node val5 = new Node(6);
		Node val6 = new Node(7);
		root.left = val1;
	    root.right = val2;
	    val1.left = val3;
	    val1.right = val4;
	    val2.left = val5;
	    val2.right = val6;
				
		List<Integer> res = nonRecursivePostOrderTraversal(root);
		
		res.stream().forEach(a -> {
			
			System.out.println(a);
			
		});
		
	}

	private static List<Integer> nonRecursivePostOrderTraversal(Node root) {
		
		List<Integer> res = new ArrayList<Integer>();
		Stack<Node> stack = new Stack<Node>();
		stack.push(root);		
		Node prev = null;
		
		if(root == null)
		{
			return res;
		}
				
		while(!stack.isEmpty())
		{
			Node current = stack.peek();
			
			if(prev == null || prev.left == current || prev.right == current)
			{
				if(current.left != null)
				{
					stack.push(current.left);
				}else if(current.right != null)
				{
					stack.push(current.right);
				}else
				{
					stack.pop();
					res.add(current.value);
				}
			}else if(current.left == prev)
			{
				if(current.right != null)
				{
					stack.push(current.right);
				}
			}else if(current.right == prev)
			{
				stack.pop();
				res.add(current.value);
			}
			
			prev = current;
		}
		
		return res;
	}

}
