package com.capgemini.myLinkedList;

import org.junit.Assert;
import org.junit.Test;


public class MyNodeTest 
{
   
    @Test
    public void given3Numbers_WhenLinked_ShouldPassTrue()
    {
    	MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(70);
        MyNode<Integer> thirdNode = new MyNode<>(30);
        firstNode.setNext(secondNode);
        secondNode.setNext(thirdNode);
        boolean result = (firstNode.getNext().equals(secondNode) && secondNode.getNext().equals(thirdNode));
        Assert.assertTrue(result);
    }
}
