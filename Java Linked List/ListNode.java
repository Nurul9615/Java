public class ListNode{

	private Object data;
	private ListNode next;

	public ListNode(Object newData, ListNode newNext){		//Constructor
		data = newData;
		next = newNext;
	}

	public Object getData(){
		return data;
	}

	public void setData(Object newData){
		data = newData;
	}

	public ListNode getNext(){
		return next;
	}

	public void setNext(ListNode newNext){
		next = newNext;
	}

}