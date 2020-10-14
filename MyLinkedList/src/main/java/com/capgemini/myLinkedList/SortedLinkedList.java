package com.capgemini.myLinkedList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SortedLinkedList {

	private static final Logger log = LogManager.getLogger(SortedLinkedList.class);
	public INode head;
	public INode tail;

	public SortedLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void append(INode newNode) {
		if (this.tail == null)
			this.tail = newNode;
		if (this.head == null)
			this.head = newNode;
		else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
		sort();
	}

	public void printNodes() {

		StringBuffer nodes = new StringBuffer("My Nodes: ");
		INode tempNode = head;
		while (tempNode.getNext() != null) {
			nodes.append(tempNode.getKey());
			nodes.append("->");
			tempNode = tempNode.getNext();
		}
		nodes.append(tempNode.getKey());
		log.info(nodes);
	}

	public void sort() {

		INode current_Node = head;
		INode prev_Node = null;
		INode next_Node = head.getNext();
		while (next_Node != null) {
			if ((int) current_Node.getKey() > (int) next_Node.getKey()) {

				if (prev_Node == null) {
					INode temp = next_Node.getNext();
					head = next_Node;
					next_Node.setNext(head);
					head.setNext(temp);
					break;
				} else {
					INode temp = next_Node.getNext();
					prev_Node.setNext(next_Node);
					next_Node.setNext(current_Node);
					current_Node.setNext(temp);

				}
				prev_Node = next_Node;
				current_Node = next_Node.getNext();
				next_Node = current_Node.getNext();

			} else {
				prev_Node = current_Node;
				current_Node = next_Node;
				next_Node = next_Node.getNext();
			}
		}
	}

}
