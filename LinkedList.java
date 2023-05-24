package com.brigelabz;

public class LinkedList<T> {
	Node<T> head;
	Node<T> tail;

	public void push(T key) {

		Node<T> newNode = new Node<>(key);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}

	}

	public void display() {
		Node<T> temp = head;
		while (temp != null) {
			System.out.print(temp.key + " -> ");
			temp = temp.next;
		}
		System.out.println();
	}

//	 public void append(){
//	        T key = null;
//	        Node<T> newNode = new Node<>(key);
//	        if (head == null){
//	            head=newNode;
//	            tail= newNode;
//	        }else {
//	            tail.next = newNode;
//	            tail = newNode;
//	        }
//	    }

	public void insert(T key, int position) {
		// Create a new node
		Node<T> newNode = new Node(key);
		if (head == null) {
			// If list is empty, both head and tail would point to new node
			head = newNode;
			tail = newNode;
		} else {
			Node temp, current;
			temp = head;
			current = null;
			for (int i = 0; i < position; i++) {
				// Node current will point to temp
				current = temp;
				// Node temp will point to node next to it.
				temp = temp.next;
			}
			// current will point to new node
			current.next = newNode;
			// new node will point to temp
			newNode.next = temp;
		}

	}

	public void pop() {
		if (head == null) {
			System.out.println("List is empty");

		} else {

			if (head != tail) {
				head = head.next;
			} else {
				head = tail = null;
			}
		}

	}

	public void popLast() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		} else {
			if (head != tail) {
				Node current = head;
				while (current.next != tail) {
					current = current.next;
				}
				tail = current;
				tail.next = null;
			} else {
				head = tail = null;
			}
		}
	}

	public Node<T> searchNode(T key) {
		Node current = head;
		int i = 1;
		boolean flag = false;
		if (head == null) {
			System.out.println("List is empty");
		} else {
			while (current != null) {
				if (current.key == key) {
					flag = true;
					break;
				}
				i++;
				current = current.next;
			}
		}
		if (flag)
			System.out.println("Element is present in the list at the position : " + i);
		else
			System.out.println("Element is not present in the list");
		return null;
	}

}
