package ds.linkedlist;

public class NodeSwap {
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	void printList()
	{
	
		Node n= head;
		while(n!=null)
		{
			System.out.print(n.data+ " ");
			n= n.next;
		}
		
	}
	
	public void addNode(int data){
	
		Node newNode= new Node(data);
		newNode.next=head;
		head= newNode;
	}

	public void swap(int a, int b)
	{
		if(a==b)
		{
			return;
		}
		Node prevA=null,currA=head;
		while(currA!=null && currA.data!=a)
		{
			prevA=currA;
			currA=currA.next;
		}
		Node prevB=null,currB=head;
		while(currB!=null && currB.data!=b)
		{
			prevB= currB;
			currB=currB.next;
		}
		if(currA==null || currB==null)
		{
			return;
		}
		if(prevA!=null)
		{
			prevA.next=currB;
		}
		else
		{
			head=currB;
		}
		if(prevB!=null)
		{
			prevB.next=currA;
		}
		else
		{
			head=currA;
		}
		
		Node temp= currA.next;
		currA.next=currB.next;
		currB.next=temp;
	}
	
	 Node reverse(Node node) {
	        Node prev = null;
	        Node current = node;
	        Node next = null;
	        
	       while (current != null) {
	            next = current.next;
	            current.next = prev;
	            prev = current;
	            current = next;
	        }
	        node = prev;
	        return node;
	    }
	 
	 Node reverseUtil(Node curr, Node prev) {
		 
	        /* If last node mark it head*/
	        if (curr.next == null) {
	            head = curr;
	 
	            /* Update next to prev node */
	            curr.next = prev;
	            return null;
	        }
	 
	        /* Save curr->next node for recursive call */
	        Node next1 = curr.next;
	 
	        /* and update next ..*/
	        curr.next = prev;
	 
	        reverseUtil(next1, curr);
	        return head;
	    }
	
	public static void main(String[] args)
	{
		NodeSwap list= new NodeSwap();
		list.head= new Node(1);
		Node second= new Node(2);
		Node third= new Node(3);
		list.head.next= second;
		second.next= third;
		
		list.addNode(4);
		list.addNode(5);
		list.addNode(6);
		list.addNode(7);
		list.printList();
		list.swap(6,2);
		System.out.println("\n");
		list.printList();
		 head = list.reverse(head);
		 System.out.println("\n");
			list.printList();
		list.reverseUtil(head, null);
		 System.out.println("\n");
			list.printList();
		
		
	}

}
