package ds.linkedlist.dll;

/*
 * class Node (contains integer value and 2 nodes to point next and prev element)
 */
class Node{
	int data;
	Node next;
	Node prev;
	
	//constructor to create a new node with int value data, next and prev are initialized to null by default
	public Node(int data){
		this.data = data;
	}
}
/*
 * class DLL has implementation of double linked list
 */
public class DLL {
	static int count;
	Node head;
	public static void main(String[] args) {
		DLL list = new DLL();
		
		list.insertAtBeginning(1);
		list.printDLL(list.head);
		System.out.println("Count is "+count);
		list.insertAtEnd(0);
		list.printDLL(list.head);
		System.out.println("Count is "+count);
		list.insertAtIndex(3, 1);
		list.printDLL(list.head);
		System.out.println("Count is "+count);
		list.deleteAtIndex(1);
		list.printDLL(list.head);
		System.out.println("Count is "+count);

	}
	
	private void deleteAtIndex(int index) {
		if(head==null || index<0 ||index>count-1){
			System.out.println("Invalid index");
			return;
		}
		Node temp = head, prev= null;
		while(index!=0){
			prev= temp;
			temp= temp.next;
			index--;
		}
		if(prev!=null){
			prev.next = temp.next;
		}else{
			head= temp.next;
		}
		if(temp.next !=null){
			temp.next.prev= prev;
		}
		temp.next=null;
		temp.prev=null;
		count--;
		
		
	}

	private void insertAtEnd(int data) {
		Node newNode = new Node(data);
		if(head==null){
			head= newNode;
			count++;
			return;
		}
		Node temp = head;
		while(temp.next!=null){
			temp = temp.next;
		}
		temp.next = newNode;
		newNode.prev = temp;
		count++;
		
		
	}

	private void printDLL(Node node) {
		
		Node temp = node;
		while(temp!=null){
			System.out.print(temp.data+ " ");
			temp = temp.next;
		}
		System.out.println();
	}

	private void insertAtBeginning(int data) {
		Node newNode = new Node(data);
		if(head==null){
			head = newNode;
			count++;
			return;
		}
		
		newNode.next = head;
		head.prev = newNode;
		head= newNode;
		count++;
	}

	private void insertAtIndex(int data, int index) {
		if(index<0 || index>count ){
			System.out.println("Invalid Index");
			return;
		}
		Node newNode = new Node(data);
		Node temp = head,prev= null;
		while(index!=0){
			prev= temp;
			temp= temp.next;
			index--;
		}
		newNode.next= temp;
		if(temp!=null){
			temp.prev = newNode;
		}
		newNode.prev = prev;
		if(prev!=null){
			prev.next= newNode;
		}else{
			head=newNode;
		}
		count++;
		
	}

}
