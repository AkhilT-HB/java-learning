package SinglyLinkedList;

public class Main {

	public static void main(String[] args) {
		
		SinglyLinkedList sl = new SinglyLinkedList();
		
		sl.createSinglyLinkedList(5);
		
		//System.out.println(sl.head.value);
		
		sl.insertInLinkedList(6, 1);
		
		sl.insertInLinkedList(7, 2);
		
		sl.insertInLinkedList(8, 3);
		
		sl.insertInLinkedList(9, 0);
	
		System.out.println(sl.head.value);
		
		sl.traverseSinglyLinkedList();
		
		//sl.searchSinglyLinkedList(5);
		
		sl.deleteSLL();
		
		sl.traverseSinglyLinkedList();
		}

}
