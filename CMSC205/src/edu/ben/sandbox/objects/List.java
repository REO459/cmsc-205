package edu.ben.sandbox.objects;

public class List {
	
	public static void main(String args[]) {
		ListNode p1 = new ListNode();
		ListNode p2 = new ListNode();
		
		p1.setItem(100);
		p2.setItem(200);
		p1.setNext(p2);
		p2.setNext(p1);
		System.out.println(p1.getItem());
		System.out.println(p2.getItem());
		System.out.println(p1.getNext().getItem());
		System.out.println(p1.getNext().getNext().getItem());
		System.out.println();
		
	}
}
