package com.brigelabz;

public class Node {//<T> implements Comparable<Node>
	    int data;
	    Node next;

	    public Node(int data ) {
	        this.data = data;
	        next = null;

	    }

//		@Override
//		public int compareTo(Node o) {
//			// TODO Auto-generated method stub
//			return ((Comparable<Node>) this.key).compareTo((Node) o.key);
//		}


}
