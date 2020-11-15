

public class SingleLinkedList {
	
	Node head;
	
	public SingleLinkedList(){
		head = null;
	}
	
	
	void append(int value) {
		if(head == null) {
			head = new Node(value);
		}else {
			
			Node newNode = new Node(value);
			
			Node temp = head;
			while(temp.next != null) {   //Goes to the end of the list
				temp = temp.next;
			}
			temp.next = newNode;         //Once end is reached, add node
		}
	}
	
	void print() {
		Node temp = head;
		
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	int get(int index) {
		Node temp = head;
		
		for(int i = 0; i < index; i++) {
			temp= temp.next;
		}
		return temp.data;
		
	}
	
	void insert(int index, int value) {
		int pos = 0;
		
		if(head == null && index == 0) {
			System.out.println("Here");
			head = new Node(value);
		}else if(head == null) {
			System.out.println("here");
			head = new Node(0);
			pos++;
		}
		
		Node temp = head;
		Node newNode = new Node(value);
		while(pos <= index) {
			if(pos == index) {
				Node oldNext = temp.next;
				temp.next = newNode;
				temp.next.next = oldNext;
			
			}else{
				if((pos < index) && (temp.next == null)) {
					append(0);
				}
				temp = temp.next;
			}
			pos++;
		}
		
	}
	
	
	
	
}
