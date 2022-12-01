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
	
 }
}