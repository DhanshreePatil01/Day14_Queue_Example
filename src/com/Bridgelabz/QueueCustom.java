package com.Bridgelabz;

public class QueueCustom {

    private final LinkedListCustom queueMadeWithLL;
	
	public QueueCustom() {
		this.queueMadeWithLL = new LinkedListCustom();
	}
	
	public void enQueue(INode element) {
		queueMadeWithLL.append(element);
	}
	
	public void printStack() {
		queueMadeWithLL.dispalyLinkedList();
	}
	
}
