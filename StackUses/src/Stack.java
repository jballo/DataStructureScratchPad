
public class Stack {
	Node head;
	
	
	public Stack() {
		head = null;
	}
	
	void push(int value) {
		if(head == null) {
			head = new Node(value);
		}else {
			Node temp = head;
			head = new Node(value);
			head.next = temp;
		}
	}
	
	void pop(){
		head = head.next;
	}
	
	void print() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	
}
