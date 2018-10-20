package ds.linkedlist;

public class MergeSortedList {
	
	Node head;
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
	
	public static void merge(MergeSortedList list, MergeSortedList list1)
	{
		MergeSortedList sort= new MergeSortedList();
		Node n=null;
		Node m=null;
		
		Node a=list.head;
		Node b=list1.head;
		
		while(a!=null || b!=null)
		{
			if(a!=null && b!=null)
			{
			if(a.data<b.data)
			{
				n=a;
				a=a.next;
				n.next=null;
			}
			else
			{
				n=b;
				b=b.next;
				n.next=null;
			}
			}else
			{
				if(a!=null)
				{
					n=a;
					a=null;
				}
				else
				{
					n=b;
					b=null;
				}
			}
			if(m==null)
			{
				m=n;
				
			}
			else
			{	
				Node x=m;
				while(x.next!=null)
				{
					x=x.next;
				}x.next=n;
			}
			
		}
		sort.head=m;
		System.out.println("merged list");
		System.out.println(list);
		System.out.println(list1);
		System.out.println();
		sort.printList();
		
	}
	public static void main(String[] args)
	{
		MergeSortedList list= new MergeSortedList();
		list.head= new Node(4);
		Node second= new Node(7);
		list.head.next= second;
		
		list.addNode(3);
		list.addNode(1);
		list.printList();
		System.out.println();
		MergeSortedList list1= new MergeSortedList();
		list1.head= new Node(6);
		list1.addNode(5);
		list1.addNode(2);
		list1.printList();
		merge(list,list1);
		
	}

}
