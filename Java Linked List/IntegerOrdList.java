public class IntegerOrdList extends OrderedList
{
    public IntegerOrdList()
    {
        super();							//Call superclass constructor to name the list "Linked List"
    }

    protected int compare(Object obj1, Object obj2)
    {
        int comparedValue = 0;

        if((Integer) obj1 < (Integer) obj2)				//If object 1 is behind object 2, return -1
            comparedValue = -1;
        else if(((Integer)obj1).intValue() == ((Integer)obj2).intValue())
            comparedValue = 0;
        else if((Integer) obj1 > (Integer) obj2)
            comparedValue = 1;
        return comparedValue;
    }
}