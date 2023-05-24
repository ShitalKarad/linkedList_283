package com.brigelabz;

public class LinkedListMain {
	public static void main(String[] args) {

		LinkedList<Integer> linkedList = new LinkedList<>();
		System.out.println("Added element in the linkedList");
		linkedList.push(70);
		linkedList.push(56);
		linkedList.display();

		System.out.println(" 30 is Added  in between 70 & 56");
		linkedList.insert(30, 1);
		linkedList.display();
		
		System.out.println("Append element in the linkedList");
		LinkedList<Integer> linkedList1 = new LinkedList<>();
		linkedList1.push(56);
		linkedList1.push(30);
		linkedList1.push(70);
		linkedList1.display();

//		System.out.println("poping firsst element in the linkedList");
//		linkedList1.pop();
//		linkedList1.display();
		
		System.out.println("deleted last element in the linkedList");
		linkedList1.popLast();
		linkedList1.display();
		
	}
}
