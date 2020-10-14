package com.capgemini.myLinkedList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyNode<K> implements INode<K> {
	private static final Logger log = LogManager.getLogger(MyNode.class);
	private K key;
	private MyNode<K> next;

	public MyNode(K key) {
		this.key = key;
		this.next = null;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public INode<K> getNext() {
		return next;
	}

	public void setNext(INode<K> next) {
		this.next = (MyNode<K>) next;
	}
}
