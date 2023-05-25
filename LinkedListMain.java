package com.brigelabz;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {
	public static void main(String[] args) {

		List<Integer> linkedList1 = new LinkedList<>();
		linkedList1.add(56);
		linkedList1.add(30);
		linkedList1.add(40);
		linkedList1.add(70);
		System.out.println("befor sorting in LinkedList "+linkedList1);
		Collections.sort(linkedList1);

		SortedLinkedList sortedLinkedList = new SortedLinkedList<>();
		for (Integer l : linkedList1) {
			sortedLinkedList.push(l);
		}

		sortedLinkedList.display();

	}
}
