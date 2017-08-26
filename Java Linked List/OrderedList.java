public abstract class OrderedList extends List
{

    protected abstract int compare(Object obj1, Object obj2);

    void insert(Object newData)
    {
        if(firstNode == null)
            firstNode = lastNode = new ListNode(newData, null);
        else
        {
            ListNode current = firstNode;
            ListNode last1 = null ;
            while(current != null && compare(current.getData(),newData) < 0)  //Going through list until the we get data larger than newdata
            {
                last1 = current;                                              // last1 is essentially the previous node to current
                current = current.getNext();
            }
            if (last1 == null)                                  // this is for if the node needs to be added to the front of the list
                firstNode=new ListNode(newData,current);        //firstnode becomes a new node with newData which references current which was the previous first node
            else		                                        //this is used when new node needs to be added between two nodes
                last1.setNext(new ListNode(newData,current));   //last one is now referenced to the new node
        }
    }

    void remove(Object remData)
    {
        if(firstNode == null)
            System.err.println("Linked List is empty");//if list is empty

        ListNode current = firstNode;
        ListNode last1 = null;

        while(current != null)
        {                                       // go till the end of list as when we reach last node current will be null
            if(compare(current.getData(),remData) == 0)         // if they are equal
            {
                if(last1 == null)                               //checking if last 1 has changed if last1 is null first node needs to be removed
                    firstNode=current.getNext();                // hence first node becomes first nodes next
                else
                    last1.setNext(current.getNext());           //last nodes reference now skips over current and is directly linked to current.getnext
            }
            last1 = current;
            current = current.getNext();
        }
    }

    public void insertAtFront(Object newData)
    {
        System.err.printf("Cannot use the insert at front method");
    }

    public void insertAtBack(Object newData)
    {
        System.err.printf("Cannot use the insert at back method");
    }
}
