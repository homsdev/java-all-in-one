package com.homsdev.collections;

class Node {
	private Integer data;
	private Node next;

	public Node(Integer data) {
		super();
		this.data = data;
		this.next = null;
	}

	public Integer getData() {
		return data;
	}

	public void setData(Integer data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}

class CustomLinkedList {
	Node head;

	CustomLinkedList() {
		this.head = null;
	}

	public void add(Integer data) {
		Node node = new Node(data);

		if (head == null)
			head = node;
		else {
			Node n = head;
			while (n.getNext() != null) {
				n = n.getNext();
			}
			n.setNext(node);
		}
	}

	public void addFirst(Integer data) {
		Node node = new Node(data);
		if (head == null)
			head = node;
		else {
			node.setNext(head);
			head = node;
		}
	}

	public void addAt(Integer data, int index) {
		if (index == 0)
			addFirst(data);
		else {
			int i = 0;
			Node node = new Node(data);
			Node n = head;
			while (i < index - 1) {
				n = n.getNext();
				i++;
			}
			node.setNext(n.getNext());
			n.setNext(node);
		}
	}

	public void printList() {
		Node n = head;
		while (n != null) {
			System.out.println(n.getData());
			n = n.getNext();
		}
	}
}

public class ExamploOfCustomList {
	public static void main(String[] args) {
		CustomLinkedList simpleList = new CustomLinkedList();
		simpleList.add(1);
		simpleList.add(2);
		simpleList.add(3);
		simpleList.add(4);
		simpleList.addAt(11, 4);
		simpleList.printList();
	}
}
