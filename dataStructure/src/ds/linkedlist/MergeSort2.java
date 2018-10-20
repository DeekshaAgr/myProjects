package ds.linkedlist;

public class MergeSort2 {
	Node head= null;
	
	class Node{
		int val;
		Node next;
		Node(int a)
		{
			val=a;
		}		
	}
	
	public Node mergSort(Node node)
	{
		if(node==null|| node.next==null)
		{
			return node;
		}
		Node middle= getMiddle(node);
		Node middleNext= middle.next;
		middle.next=null;
		
		Node left=mergSort(node);
		Node right= mergSort(middleNext);
		
		Node sorted= sortedMerge(left,right);
		
		return sorted;
	}
	
	Node sortedMerge(Node left,Node right)
	{
		if(left==null)
		{
			return right;
		}
		if(right==null)
		{
			return left;
		}
		Node result=null;
		if(left.val<right.val)
		{
			result=left;
			result.next=sortedMerge(left.next,right);
		}
		else{
			result=right;
			result.next=sortedMerge(right.next,left);
		}
		return result;
	}
	Node getMiddle(Node node)
	{
		if(node==null)
		{
			return node;
		}
		Node fast=node.next;
		Node slow= node;
		while(fast!=null)
		{
			fast=fast.next;
			if(fast!=null)
			{
				slow=slow.next;
				fast=fast.next;
			}
		}
		return slow;
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
	
	public static void main(String[] args)
	{
		MergeSort2 list= new MergeSort2();
		list.addNode(1);
		list.addNode(4);
		list.addNode(8);
		list.addNode(2);
		list.addNode(7);
		list.addNode(3);
		list.addNode(9);
		list.printList(list.head);
		list.head= list.mergSort(list.head);
		System.out.println();
		list.printList(list.head);
	}

}
