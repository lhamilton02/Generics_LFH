package main;
import linkedlist.GenericNode;
import linkedlist.GenericLinkedList;

public class TestLinkedList 
{

	public static void main(String[] args) 
	{
		
		/**LinkedList myList=new LinkedList();
		
		*Node aNode=new Node();
		*aNode.setData("Element 1");
		*myList.addNode(aNode);
		*aNode = new Node();
		*aNode.setData("Element 2");
		*myList.addNode(aNode);
		*Node tempnode=myList.getList();
		*do 
		*{
		*		System.out.println(tempnode.getData());
		*	tempnode=tempnode.getNextNode();
		*} while (tempnode!=null);  **/
		
		
		 // Create a GenericLinkedList that can hold Integer objects
        GenericLinkedList<Integer> intList = new GenericLinkedList<>();
        GenericNode<Integer> intNode = new GenericNode<>();
        intNode.setData(1);
        intList.addNode(intNode);
        intNode = new GenericNode<>();
        intNode.setData(2);
        intList.addNode(intNode);
        
        GenericNode<Integer> intTempNode = intList.getList();
        do {
            System.out.println(intTempNode.getData());
            intTempNode = intTempNode.getNextNode();
        } while (intTempNode != null);
        
        

        // Create a GenericLinkedList that can hold Double objects
        GenericLinkedList<Double> doubleList = new GenericLinkedList<>();
        GenericNode<Double> doubleNode = new GenericNode<>();
        doubleNode.setData(3.14);
        doubleList.addNode(doubleNode);
        doubleNode = new GenericNode<>();
        doubleNode.setData(2.718);
        doubleList.addNode(doubleNode);
        
        GenericNode<Double> doubleTempNode = doubleList.getList();
        do {
            System.out.println(doubleTempNode.getData());
            doubleTempNode = doubleTempNode.getNextNode();
        } while (doubleTempNode != null);
        
		
     // Create a GenericLinkedList that can hold String objects
        GenericLinkedList<String> stringList = new GenericLinkedList<>();
        GenericNode<String> stringNode = new GenericNode<>();
        stringNode.setData("");
        stringList.addNode(stringNode);
        stringNode = new GenericNode<>();
        stringNode.setData("World");
        stringList.addNode(stringNode);

        GenericNode<String> stringTempNode = stringList.getList();
        do {
            System.out.println(stringTempNode.getData());
            stringTempNode = stringTempNode.getNextNode();
        } while (stringTempNode != null);
		
	}//end main

}//end class
