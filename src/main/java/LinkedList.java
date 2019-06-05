package main.java;

public class LinkedList{
	
	Node first;
	
	
	LinkedList()
	{
		first=null;
	}
	
	public void insert(String name,int salary){
		Node node= new Node(name,salary);
		node.next=first;
		first=node;
		
	}
	
	public Node delete()
	{
		if(first==null)
			return null;
		Node tmp=first;
		first=first.next;
		return tmp;
	}
	
	public boolean isEmpty()
	{
		return first==null;
	}
	
	public void printAll()
	{
		Node current=first;
		while(first!=null)
		{
			System.out.println("Node:->" +first.name+ " " +first.salary);
			first=first.next;
		}
		first=current;
	}
	
	
	public static void main(String args[]) {
		
		LinkedList link = new LinkedList();
		
		link.insert("Santosh",200000);
		link.insert("Santosh1",200001);
		link.insert("Santosh2",200002);
		link.insert("Santosh3",200003);
		link.insert("Santosh4",200004);
		
		link.printAll();
		
		link.delete();
		link.printAll();
		
	}
}
