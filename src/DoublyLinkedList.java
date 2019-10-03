
public class DoublyLinkedList<E>{
	Node<E> head;
	Node<E> tail;
	private int size=0;
	
	DoublyLinkedList() {
		head = new Node<>(null, null, null);
		tail = new Node<>(null, head, null);
		head.setNext(tail);
	}
	int size() {return size;}
	boolean isEmpty() {return size == 0;}
	
	E first() {
		if(isEmpty()) return null;
		return head.getNext().getElement();
	}
	
	E last() {
		if(isEmpty()) return null;
		return tail.getPrev().getElement();
	}
	
	void addBetween(E e, Node<E> before, Node<E> after) {
		Node<E> newNode = new Node<>(e, before, after);
		before.setNext(newNode);
		after.setPrev(newNode);
		size++;
	}
	
	void addFirst(E e) {
		addBetween(e, head, head.getNext());
	}
	
	void addLast(E e) {
		addBetween(e, tail.getPrev(), tail);
	}
		
	E remove(Node<E> node) {
		Node<E> before = node.getPrev();
		Node<E> after = node.getNext();
		before.setNext(node.getNext());
		after.setPrev(node.getPrev());
		size--;
		return node.getElement();
	}
	
	E removeFirst() {
		if(isEmpty()) return null;
		return (remove(head.getNext()));
	}
	
	E removeLast() {
		if(isEmpty()) return null;
		return (remove(tail.getPrev()));
	}
	
	E isiList(int pos) {
		Node<E> temp = head;
		int count=0;
		
		while(temp != null) {
			if(count == pos)
				return temp.getElement();
			count++;
			temp=temp.getNext();
		}
		
		assert(false);
		return null;
	}
}
