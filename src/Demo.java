
public class Demo {
	public static void printListInt(DoublyLinkedList<Integer> list) {
		Node<Integer> temp = list.head.getNext();
		while(temp != list.tail) {
			System.out.print(temp.getElement().intValue()+"  ");
			temp=temp.getNext();
		}
		System.out.println("");
	}
	
	public static void printListDouble(DoublyLinkedList<Double> list) {
		Node<Double> temp = list.head.getNext();
		while(temp != list.tail) {
			System.out.print(temp.getElement().doubleValue()+"  ");
			temp=temp.getNext();
		}
		System.out.println("");
	}
	
	public static void printListChar(DoublyLinkedList<Character> list) {
		Node<Character> temp = list.head.getNext();
		while(temp != list.tail) {
			System.out.print(temp.getElement()+"  ");
			temp=temp.getNext();
		}
		System.out.println("");
	}
	
	public static void printListString(DoublyLinkedList<String> list) {
		Node<String> temp = list.head.getNext();
		while(temp != list.tail) {
			System.out.print(temp.getElement()+"  ");
			temp=temp.getNext();
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		DoublyLinkedList<Character> list1 = new DoublyLinkedList<>();
		list1.addFirst('Z');
		printListChar(list1);
		list1.addLast('A');
		list1.addLast('A');
		list1.addLast('B');
		printListChar(list1);
		list1.removeFirst();
		list1.removeFirst();
		list1.addFirst('P');
		list1.addLast('N');
		list1.addLast('N');
		printListChar(list1);
		list1.removeFirst();
        list1.removeFirst();
        list1.addFirst('P');
        list1.addFirst('C');
        list1.addFirst('D');
        list1.removeLast();
        list1.removeLast();
        list1.addLast('X');
        list1.addLast('X');
        printListChar(list1);
        System.out.println("Index ke-2 = "+list1.isiList(2));
		
		System.out.println();
		DoublyLinkedList<String> list2 = new DoublyLinkedList<>();
		list2.addFirst("Malang");
        list2.addLast("Surabaya");
        list2.addLast("Jakarta");
        printListString(list2);

        list2.addLast("Semarang");
        list2.addLast("Bandung");
        printListString(list2);

        list2.remove(list2.head.getNext().getNext().getNext());
        printListString(list2);

        list2.addLast("Madiun");
        list2.addLast("Blitar");
        printListString(list2);

        list2.remove(list2.tail.getPrev());
        list2.remove(list2.head.getNext().getNext());
        printListString(list2);

        list2.addLast("Kediri");
        printListString(list2);

        list2.remove(list2.tail.getPrev().getPrev());
        printListString(list2);

        list2.addLast("Garut");
        list2.addLast("Sumedang");
        printListString(list2);
		
	}
}
