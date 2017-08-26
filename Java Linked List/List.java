public class List
{
    protected ListNode firstNode;
    protected ListNode lastNode;
    protected String name;

    public List(String listName)
    {
        firstNode = lastNode = null;
        name = listName;
    }

    public List()
    {
        this("Linked List");
    }

    public ListNode getFirst()
    {
        return firstNode;
    }

    public String toString()
    {
        String output = new String();
        ListNode current = firstNode;

        output = name + ":";

        if(current == null)
            return "Linked list is empty";

        while(current != null)
        {
            output += " " + current.getData();
            current = current.getNext();
        }
        return output;
    }

    //Not used
    public void insertAtFront(Object newData)
    {
        if(firstNode == null)
            firstNode = lastNode = new ListNode(newData, null);
        else
        {
            ListNode newFirstNode = new ListNode(newData,firstNode);
            firstNode = newFirstNode;
        }
    }

    //Not used
    public void insertAtBack(Object newData)
    {
        if(firstNode == null)
            firstNode = lastNode = new ListNode(newData, null);
        else
        {
            ListNode newLastNode = new ListNode(newData,null);
            lastNode.setNext(newLastNode);
            lastNode = newLastNode;
        }
    }

    public Object removeFromFront()
    {
        if(firstNode == null)						//Empty List
            return null;

        Object removedData = firstNode.getData();	//Return the data that will you will remove first back to the user

        if(firstNode == lastNode)					//If there is only one list node
            firstNode = lastNode = null;			//Make the list empty
        else										//If there is more than one node, point the the next node after the one that has just been removed
            firstNode = firstNode.getNext();
        return removedData;
    }

    public Object removeFromBack()
    {
        if(firstNode == null)							//Empty List
            return null;

        Object removedData = lastNode.getData();		//Return data that you will remove back to the user

        if(firstNode == lastNode)						//If there is only one node in the list
            firstNode = lastNode = null;				//Make the list empty
        else
        {
            ListNode current = firstNode;				//Start from the beginning of the list
            while(current.getNext() != lastNode)		//Reach the second last node in the list
                current = current.getNext();

            lastNode = current;							//The second last node will be the new last node
            current.setNext(null);						//New last node now points to null
        }
        return removedData;
    }
}	