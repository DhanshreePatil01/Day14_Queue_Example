package com.Bridgelabz;

public class QueueMain {

	public static void main(String[] args) {
		
		QueueCustom sampleQueue = new QueueCustom();
	
	MyNode<Integer> nodeFirstForQueue = new MyNode<Integer>(56);
	MyNode<Integer> nodeSecondForQueue = new MyNode<Integer>(30);
	MyNode<Integer> nodeThirdForQueue = new MyNode<Integer>(70);
	
	sampleQueue.enQueue(nodeFirstForQueue);
	sampleQueue.enQueue(nodeSecondForQueue);
	sampleQueue.enQueue(nodeThirdForQueue);
	System.out.println("-----------------------------------------------------------------------------------");
	sampleQueue.printStack();
	
	System.out.println("-----------------------------------------------------------------------------------");
	System.out.println("\nQueue before deletion:");
	sampleQueue.printStack();
	
	INode deletedNode=sampleQueue.deQueue();
	System.out.println("\nThe node is deleted: "+deletedNode.getKey());
		
	System.out.println("\nQueue after deletion using deQueue method:");
	sampleQueue.printStack();
	System.out.println("-----------------------------------------------------------------------------------");
 }
}