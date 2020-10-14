package com.capgemini.myLinkedList;

import org.junit.Assert;
import org.junit.Test;

public class SortedLinkedListTest {

	@Test
	public void given3Numbers_WhenAddedToLinkedList_ShouldBeAddedAtTail() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(40);
		MyNode<Integer> fourthNode = new MyNode<Integer>(70);
		SortedLinkedList sortedLinkedList = new SortedLinkedList();
		sortedLinkedList.append(firstNode);
		sortedLinkedList.append(secondNode);
		sortedLinkedList.append(thirdNode);
		sortedLinkedList.append(fourthNode);
		sortedLinkedList.sort();
		sortedLinkedList.printNodes();
		boolean result = sortedLinkedList.head.equals(secondNode) && sortedLinkedList.head.getNext().equals(thirdNode)
				&& sortedLinkedList.tail.equals(fourthNode);
		Assert.assertTrue(result);
	}
}
