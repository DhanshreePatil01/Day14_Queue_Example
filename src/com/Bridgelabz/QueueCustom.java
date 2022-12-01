package com.Bridgelabz;

public class QueueCustom {

    private final LinkedListCustom queueMadeWithLL;
	
	public QueueCustom() {
		this.queueMadeWithLL = new LinkedListCustom();
	}
	
	public void enQueue(INode element) {
		queueMadeWithLL.append(element);
	}
	
	public boolean isEmpty() {
		if(queueMadeWithLL.head!=null) {
			return false;
		}else {
			return true;
		}
	}
	
	public INode deQueue() {
		return queueMadeWithLL.pop();
	}

	public void printStack() {
		queueMadeWithLL.dispalyLinkedList();
	}
	
}
