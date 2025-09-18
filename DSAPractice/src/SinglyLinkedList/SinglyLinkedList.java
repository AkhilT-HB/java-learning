package singlyLinkedList;

public class SinglyLinkedList {

	public Node head;
	public Node tail;
	public int size;
	
	// Creating a Singly Linked List
	public Node createSinglyLinkedList(int nodeValue) {
//		head = new Node();
		Node node = new Node();
		node.value = nodeValue;
		node.next=null;
		head = node;
		tail = node;
		
		size = 1;
		
		return node;
	}
	
	//Insert values to the Single Linked List
	public void insertInLinkedList(int nodeValue, int location) {
		Node node = new Node();
		node.value=nodeValue;
		
		if(head == null) {
			createSinglyLinkedList(nodeValue);
		}else if(location == 0){
			node.next=head;
			head=node;
		}else if(location >= size) {
			tail.next=node;
			node.next=null;
			tail = node;
		}else {
			Node tempNode = new Node();
			tempNode = head;
			int index = 0;
			while(index < location-1) {
				tempNode = tempNode.next;
				index++;
			}
			
			Node nextNode = tempNode.next;
			
			tempNode.next=node;
			node.next=nextNode;
		}
		size++;
	}
	
	//Traverse through Single Linked List
	public void traverseSinglyLinkedList() {
		if(head == null) {
			System.out.println("SinglyLinkedList does not exist");
		}else {
			Node tempNode = new Node();
			tempNode = head;
			for(int i=0;i<size;i++) {
				System.out.print(tempNode.value);
				
				if(i!= size-1) {
					System.out.print("->");
				}
				
				tempNode = tempNode.next;
			}
		}
		System.out.println("\n");
	}
	
	
	//Search for a Node in a Single Linked List
	public boolean searchSinglyLinkedList(int value) {
		if(head != null) {
			Node tempNode = new Node();
			tempNode = head;
			for(int i=0;i<size;i++) {
				if(tempNode.value == value) {
					System.out.println("Found the node at index: "+i);
					return true;
				}else {
					tempNode = tempNode.next;
				}
			}
		}
		
		System.out.println("Node not found");
		return false;
	}
	
	//Deleting a node from Singly Linked List
	public void deletionOfNode(int location) {
		if(head == null) {
			System.out.println("The SinglyLinked List does not exist");
			return;
		}else if(location == 0) {
			head = head.next;
			size--;
			if(size==0) {
				tail = null;
			}
		}else if(location >= size) {
			Node tempNode = head;
			for(int i=0;i<size-2;i++) {
				tempNode = tempNode.next;
			}
			if(tempNode == head) {
				tail = head = null;
				size--;
				return;
			}
			tempNode.next=null;
			tail = tempNode;
			size--;
		}else {
			Node tempNode = head;
			for(int i=0;i<location-1;i++) {
				tempNode = tempNode.next;
			}
			tempNode.next = tempNode.next.next;
			size--;
		}
		
	}
	
	// Deleting the entire singly linked list
	public void deleteSLL() {
		head = null;
		tail = null;
		System.out.println("SLL Deleted succesfully");
	}

}
