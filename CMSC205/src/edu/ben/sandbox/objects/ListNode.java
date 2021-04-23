package edu.ben.sandbox.objects;

public class ListNode {
	public Object item;
	public ListNode next;

	public void setItem(Object item) {
		this.item = item;
	}

	public Object getItem() {
		return item;
	}
	
	public ListNode getNext() {
		return next;
	}
	
	public void setNext(ListNode next) {
		this.next = next;
	}

}