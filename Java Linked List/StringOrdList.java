public class StringOrdList extends OrderedList{

	/*public StringOrdList(){
		super();						//Call superclass constructor to name the list "Linked List"
	}*/

	protected int compare(Object obj1, Object obj2){

		int comparedValue = ((String)obj1).compareToIgnoreCase((String)obj2);	//Compares the 2 strings 
		
		if(comparedValue < 0){
			return -1;
		}
		else if(comparedValue > 0){
			return 1;
		}
		else{
			return 0;
		}
	}
}