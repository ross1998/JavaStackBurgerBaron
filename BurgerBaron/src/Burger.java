
public class Burger {
	
	String burgerString;
	private MyStack<Object> baronBurger;
    private MyStack<Object> finalBurger;
	private MyStack<Object> normalBurger;
	private String myPattyType;
	private Boolean truthValue;
	
	public Burger (boolean theWorks) {
		
		truthValue = theWorks;
		baronBurger = new MyStack<Object>();
		
		baronBurger.push("Bottom Bun");
		baronBurger.push("Ketchup");
		baronBurger.push("Mustard");
		baronBurger.push("Mushrooms");
		baronBurger.push("Patty");
		baronBurger.push("Cheddar"); //If more than one patty cheese goes on the bottom 
		baronBurger.push("Mozzarella");
		baronBurger.push("Pepperjack");
		baronBurger.push("Onions");
		baronBurger.push("Tomato");
		baronBurger.push("Lettuce");
		baronBurger.push("Baron Sauce");
		baronBurger.push("Mayonnaise");
		baronBurger.push("Top Bun");
		baronBurger.push("Pickle");
		
		normalBurger = new MyStack<Object>();
		
		normalBurger.push("Buttom Bun");
		normalBurger.push("Patty");
		normalBurger.push("Top Bun");
		
		if (theWorks == true) {
			
			finalBurger = new MyStack<Object>();
			
			finalBurger.push("Bottom Bun");
			finalBurger.push("Ketchup");
			finalBurger.push("Mustard");
			finalBurger.push("Mushrooms");
			finalBurger.push("Patty");
			finalBurger.push("Cheddar"); //If more than one patty cheese goes on the bottom 
			finalBurger.push("Mozzarella");
			finalBurger.push("Pepperjack");
			finalBurger.push("Onions");
			finalBurger.push("Tomato");
			finalBurger.push("Lettuce");
			finalBurger.push("Baron Sauce");
			finalBurger.push("Mayonnaise");
			finalBurger.push("Top Bun");
			finalBurger.push("Pickle");
			
		} else if (theWorks == false) {
		
			finalBurger = new MyStack<Object>();
			
			finalBurger.push("Buttom Bun");
			finalBurger.push("Patty");
			finalBurger.push("Top Bun");
			
			
			
		}
		
	}
	void changePatties(String pattyType) {
		
		MyStack<Object> tempStack  = new MyStack<Object>();
		int pattyCounter = 3;
		
		if (truthValue = true) {
			
			
//			do {
//				
//				tempStack.push(finalBurger.pop());
//					
//			} while(!finalBurger.peek().equals("Patty"));
//			while (!finalBurger.peek().equals("Patty")) {
//				
//			}
			// for one patty works at 4 , for two patties works at 5 or 6
			for (int i = 0; i < 5; i++) {
				
				while(!finalBurger.peek().equals("Patty")) {
					
					tempStack.push(finalBurger.pop());
					
				}
				
				if (finalBurger.peek().equals("Patty")) {
					
					finalBurger.pop();
					finalBurger.push(pattyType);
					//pattyCounter += 1;
					
				}
				
				tempStack.push(finalBurger.pop());
				
				while(!tempStack.isEmpty()) {
					
					finalBurger.push(tempStack.pop());
					
				}
				i++;
			}
			//System.out.println(baronBurger.size());
			
			
		} else {
			
		}
		

		
	
		
	}
	void addPatty() {
		
		MyStack<Object> tempStack = new MyStack<Object>();
		
		if (truthValue == true) {
			
			while (!finalBurger.peek().equals("Pepperjack") && !finalBurger.peek().equals("Cheddar") &&
					!finalBurger.peek().equals("Mozzarella") && !finalBurger.peek().equals("Patty")) {
				
				tempStack.push(finalBurger.pop());
				
			}
			
			tempStack.push("Patty");
			
			while(!tempStack.isEmpty()) {
				finalBurger.push(tempStack.pop());
			}	
			
		} else {
			
			while(!finalBurger.peek().equals("Pepperjack") && !finalBurger.peek().equals("Cheddar") &&
					!finalBurger.peek().equals("Mozzarella") && !finalBurger.peek().equals("Patty")) {
				
				tempStack.push(finalBurger.pop());		
				
			}
			
			tempStack.push("Patty");
			
			while(!tempStack.isEmpty()) {
				finalBurger.push(tempStack.pop());
			}
			
				
		}
		
		
//		if (myPattyType == "Chicken") {
//			
//			tempStack.push("Chicken");
//			finalBurger.push(tempStack.pop());
//			
//		} else if (myPattyType == "Beef") {
//			
//			tempStack.push("Chicken");
//			finalBurger.push(tempStack.pop());
//			
//		} else if (myPattyType == "Veggie") {
//			
//			tempStack.push("Chicken");
//			finalBurger.push(tempStack.pop());
//			
//		}
		
	}
	
	void addCategory(String type) {
		
		//MyStack<Object> tempStack = new MyStack<Object>();
		
		if (type == "Veggies") {
			
			addIngredient("Mushrooms");
			addIngredient("Onions");
			addIngredient("Tomato");
			addIngredient("Lettuce");
			addIngredient("Onions");
			addIngredient("Pickle");

			
		} else if (type == "Cheese") {
			
			addIngredient("Cheddar");
			addIngredient("Mozzarella");
			addIngredient("Pepperjack");
			
		} else if (type == "Sauce") {
			
			addIngredient("Ketchup");
			addIngredient("Mustard");
			addIngredient("Baron Sauce");
			addIngredient("Mayonnaise");
			
		}
		
		
	}
	
	void removeCategory(String type) {
		
		MyStack<Object> tempStack = new MyStack<Object>();
		
		if (type == "Veggies") {
			
			removeIngredient("Mushrooms");
			removeIngredient("Onions");
			removeIngredient("Tomato");
			removeIngredient("Lettuce");
			removeIngredient("Onions");
			removeIngredient("Pickle");

			
		} else if (type == "Cheese") {
			
			removeIngredient("Cheddar");
			removeIngredient("Mozzarella");
			removeIngredient("Pepperjack");
			
		} else if (type == "Sauce") {
			
			removeIngredient("Ketchup");
			removeIngredient("Mustard");
			removeIngredient("Baron Sauce");
			removeIngredient("Mayonnaise");
			
		}
		
		
	}
	
	void addIngredient(String type) {
		MyStack<Object> smallTempStack = new MyStack();
		MyStack<Object> bigTempStack = new MyStack(); 
		while(!baronBurger.peek().equals(type)) {
			if (baronBurger.peek().equals(finalBurger.peek())) {
				bigTempStack.push(baronBurger.pop());
				smallTempStack.push(finalBurger.pop());
			} else {
				bigTempStack.push(baronBurger.pop());
			}
		}
		if(!finalBurger.peek().equals(type)) {
			finalBurger.push(type);
		}
		while(!smallTempStack.isEmpty()) {
			finalBurger.push(smallTempStack.pop());
		}
		while(!bigTempStack.isEmpty()) {
			baronBurger.push(bigTempStack.pop());
		}

		
	}
	
	void removeIngredient(String type) {
		
		MyStack<Object> tempStack  = new MyStack<Object>();
		
		while (finalBurger.peek() != type) {
			
			tempStack.push(finalBurger.pop());
			
		}
		
		finalBurger.pop();
		
		while(!tempStack.isEmpty()) {
			finalBurger.push(tempStack.pop());
			
		}
		
	}
	
	public String toString() {
		
		return finalBurger.toString();
		
	}
	

}
