
public class MyStack<Type> {
	
	private int numberOfItems;
	private boolean truthValue;
	private Node topHead;

	MyStack() {
		
		this.topHead = null;
		numberOfItems = 0;
		
	}
	
	boolean isEmpty() {
		
		truthValue = false;
		
		if(topHead == null) {
			
			truthValue = true;
			
		} 
		
		return truthValue;
		
	}
	
	void push(Type item) {
		
		Node temp = new Node(item, topHead);
		topHead = temp;
		numberOfItems += 1;
		//truthValue = false;
		
	}
	
	Type pop() {

		if (!isEmpty()) {
			
			Type temp = topHead.item;
			
			topHead = topHead.next;	
			numberOfItems -= 1;
			
			return temp;
			
		} else {
			
			Type temp = (Type) "You cant pop something thats not there (;";
			return temp;
			
		}
	
		
	}
	
	Type peek() {
		
		if (!isEmpty()) {
			
			return topHead.item;	
			
		} else {
			
			Type temp = (Type) "Empty Stack";
			
			return temp;
		}
		
		
	}
	
	int size() {
	
		return numberOfItems;
		
	}
	
	@Override
	public String toString() {
		
		String mainPrint = "";
		String finalString = "";
		String tempString;
		int tempSize = 0;
		tempSize = numberOfItems;
		int integer;
		MyStack tempStack = new MyStack();

		while(!this.isEmpty()) {
			
			mainPrint += this.peek() + ", ";
			tempStack.push(this.pop());
			
		}
		
		while (!tempStack.isEmpty()) {
			
			this.push((Type) tempStack.pop());
			
		}
		
		numberOfItems = this.size();
		
		integer = mainPrint.length();
		StringBuilder sb = new StringBuilder(mainPrint);
		sb.deleteCharAt(integer - 2);
		sb.deleteCharAt(integer - 2);
		tempString = sb.toString();
		
		finalString = ("[" + tempString + "]");

		return finalString;
		
	}
	
	private class Node {
		
		Type item;
		Node next;
		
		Node(Type item, Node next) {
		
			this.item= item;
			this.next= next;
			
		}
	}
}