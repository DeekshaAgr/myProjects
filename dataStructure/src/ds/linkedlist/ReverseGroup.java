package ds.linkedlist;

import ds.linkedlist.ReverseGroup.Node;

public class ReverseGroup {
	Node head= null;
	
	class Node{
		int val;
		Node next;
		Node(int a)
		{
			val=a;
		}		
	}
	
	
	
	
	public void printList(Node node){
		if(node==null)
		{
			return;
		}
		else
		{
			while(node!=null)
			{
				System.out.print(node.val+" ");
				node=node.next;
			}
		}
	}
	
	public void addNode(int data)
	{
		Node node= new Node(data);
		node.next=head;
		head= node;
	}

	private Node reverseGroup(Node node, int i) {
		
		if(node== null || node.next==null)
		{
			return node;
		}
		Node current = head;
	       Node next = null;
	       Node prev = null;
		int count=0;
		while(current!=null && count<i)
		{
			 next = current.next;
	           current.next = prev;
	           prev = current;
	           current = next;
	           count++;
		}
		  if (next != null) 
	          head.next = reverseGroup(next,i);
	 
	       // prev is now head of input list
	       return prev;
	}
	
	public static void main(String[] args)
	{
		ReverseGroup list= new ReverseGroup();
		list.addNode(1);
		list.addNode(4);
		list.addNode(8);
		list.addNode(2);
		list.addNode(7);
		list.addNode(3);
		list.addNode(9);
		list.printList(list.head);
		list.head =list.reverseGroup(list.head,3);
		System.out.println();
		list.printList(list.head);
	}

}
