package com.capgemini.myLinkedList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class MyNode <K>
{
	private static final Logger log = LogManager.getLogger(MyNode.class);
	private K key;
	private MyNode next;
	public MyNode(K key) {
		this.key = key;
		this.next = null;
	}
	public MyNode getNext() {
	return next;
	}
	public void setNext(MyNode next) {
		this.next = next;
	}
}
