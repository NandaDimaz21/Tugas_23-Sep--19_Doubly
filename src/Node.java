
public class Node<E>{
	E element;
	Node<E> next;
	Node<E> prev;
	
	Node(E e,Node<E> p,Node<E> n){
		element = e;
		prev = p;
		next = n;
	}
	
	E getElement() {
		return element;
	}
	
	Node<E> getPrev(){
		return prev;
	}
	
	Node<E> getNext(){
		return next;
	}
	
	void setNext(Node<E> n) {
		next = n;
	}
	
	void setPrev(Node<E> p) {
		prev = p;
	}
}
