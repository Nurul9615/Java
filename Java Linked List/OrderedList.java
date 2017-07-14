public abstract class OrderedList extends List{

	protected abstract int compare(Object obj1, Object obj2);
	
	public void insert(Object insertData){

		ListNode current = this.getFirst();							//Returns first node by calling superclass
		int counter = 0;
		int comparedValue = 10;

		if(current == null){										//If list is empty, make the new node the only item in the list which points to null
			ListNode newNode = new ListNode(insertData, null);
			firstNode = newNode;
		}

		else{																	//Traverse the list by starting from the first node
																	            
			comparedValue = compare(insertData, current.getData());				//First, compare your new data and the first node, then the next node etc

			if(comparedValue == 0){													//If compared nodes have the same data, put it between the current node and the one after current node
				ListNode newNode = new ListNode(insertData, current.getNext());		//New node with new data created which points to next node
				current.setNext(newNode);											//First node now points to the new node
			}

			else if(comparedValue == -1){
				ListNode newNode = new ListNode(insertData, current);				//New node goes before the current node so it points to the current node
				firstNode = newNode;												//It is essentially inserted at beginning of list					
			}

			while(comparedValue == 1){												//If our data is higher than the current node then

				current = current.getNext();										//Traverse the list starting from firstnode
				counter++;															//Keep track how many nodes you traverse to reach the point to insert new data

				if(current == null){												//If you reach end of list then
					ListNode previousNode = this.getFirst();						//Make a node which starts from the firstnode
					ListNode newNode = new ListNode(insertData, current);
					for(int i = 0; i < counter-1; i++){
						previousNode = previousNode.getNext();						//Insert between last one and the one before the last one so previousNode->newNode->current
					}
					previousNode.setNext(newNode);
					comparedValue = 10;
				}
				else{
					comparedValue = compare(insertData, current.getData());

					if(comparedValue == 0){															//If somewhere RIGHT in the middle of the list then
						ListNode newNode = new ListNode(insertData, current.getNext());
						current.setNext(newNode);
					}
					else if(comparedValue == -1){

						ListNode previousNode = this.getFirst();
						ListNode newTemp = new ListNode(insertData, current);

						for(int i = 0; i < counter-1; i++){
							previousNode.getNext();
						}
						previousNode.setNext(newTemp);
					}
				}
			}
		}	
	}

	public boolean remove(Object remData){
		
		ListNode current = this.getFirst();					//Current contains the firstnode
		int counter = 0;

		if(current == null){								//If list is empty
			System.out.println("Linked list is empty");
			return false;
		}

		int comparedValue = compare(remData, current.getData());

		if(comparedValue == 0){												//If removed data is same as the first node then
			firstNode = current.getNext();									//New firstnode is the one after the current node(which is the current firstnode atm)
			System.out.println(remData + " has been deleted");
			return true;
		}

		while(current.getNext() != null){								//If there are nodes after the first node
			
			ListNode previousNode = getFirst();
			comparedValue = compare(remData, current.getData());
			
			if(comparedValue == 0){										//If data to be removed is equal to previousnode
				if(counter == 1){
					previousNode.setNext(current.getNext());
				}
				else{
					for(int i = 0; i < counter-1; i++){
						previousNode = previousNode.getNext();
					}
				}
				previousNode.setNext(current.getNext());
				return true;
			}
			else{
				counter++;
				current = current.getNext();
			}
		}

		comparedValue = compare(remData, current.getData());

		if(comparedValue == 0){
			if(counter == 0){
				firstNode = null;
				return true;
			}
			else{
				ListNode previousNode = getFirst();
				for(int i = 0; i < counter-1; i++){
					previousNode = previousNode.getNext();
				}
				previousNode.setNext(null);
				return true;
			}
		}
		else{
			System.out.println(" ");
			System.out.println("Cannot find that integer or string");
			return false;
		}
	}

	public void insertAtFront(Object newData){
		System.err.printf("Cannot use the insert at front method");
	}

	public void insertAtBack(Object newData){
		System.err.printf("Cannot use the insert at back method");
	}
}
