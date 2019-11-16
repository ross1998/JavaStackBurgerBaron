import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static String emptyString = "";
	private static Scanner input;
	private static Scanner inputLine;
	static String pattyCount;
	static String myPattyType;
	static String omissions;
	static String additions;
	static String exceptions;
	String burgerString;
	static String fileString = "files/customer.txt";
	private static String typeOneOrder;
	private static String typeTwoOrder;
	private static String testString;
	static Burger myBurger;
	static boolean theWorks;
	

	public static void main(String[] args) {
		
		parseLine(fileString);
		//testBurger();
		//testMyStack();
	}
	
	static void parseLine(String line) {
		
		//boolean theWorks;
		//myBurger = new Burger(theWorks);
		
		try {
			inputLine = new Scanner(Paths.get(line));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		ArrayList<String> lineList = new ArrayList<String>();
		
		while (inputLine.hasNextLine()) {
			
			lineList.add(inputLine.nextLine());
			//System.out.println(lineList);
			
			
		}
		
		for (String str: lineList) {
			
			parseLineHelper(str);
			
		}

//		typeOneOrder = (pattyCount + myPattyType + "Burger Baron with no " + additions + "but" + omissions);
//		typeTwoOrder = (pattyCount + myPattyType + "Burger with " + additions + "but no" + exceptions);			
//			
//		System.out.println(typeOneOrder);
//		System.out.println(typeTwoOrder);
	}
	
	static void parseLineHelper(String line) {
		
		//Burger myBurger;
		//boolean theWorks;
		
		ArrayList<String> myOrders = new ArrayList<String>();
		
		Scanner helperScanner = new Scanner(line);
		
		while (helperScanner.hasNext()) {
			
			myOrders.add(helperScanner.next());
			
		}
		
		if (myOrders.contains("Baron")) { //if the order contains the string "Baron" then uses the corresponding "theWorks" recipe
			
			theWorks = true;
			myBurger = new Burger(theWorks);
			
		} else {
			
			theWorks = false;
			myBurger = new Burger(theWorks);
		}
		
		
		if (myOrders.get(0).equals("Double") || myOrders.get(0).equals("Triple")) { //Checks the pattyCount
			
			if (myOrders.get(0).equals("Double")) {
				
				for (int i = 0; i < 2 ; i++) {
					
					//myBurger.addPatty();
				}
			} else {
				
				for (int i = 0; i < 3; i++) {
					
					//myBurger.addPatty();
				}
			}	
			//pattyCount = myOrders.get(0);
			
		} else {
			
			//myBurger.addPatty();
			myOrders.add(0, "Single");
			
		}
		
		//System.out.println(myOrders);
		
		if (myOrders.get(1).equals("Chicken") || myOrders.get(1).equals("Beef") || myOrders.get(0).equals("Veggie")) { //Checks the pattyType
			
			//myBurger.changePatties(myOrders.get(1));
			myPattyType = myOrders.get(1);	
			
		} else {
			
			//myBurger.changePatties("Beef");
			myOrders.add(1, "Beef");
		}
		
		System.out.println(myOrders);
			
			
	}
	
		
	
	private static void testMyStack() {
		
		MyStack <String> trialStack = new MyStack<String>();
		trialStack.push("A");
		trialStack.push("B");
		trialStack.push("C");
		trialStack.push("D");
		
		System.out.println("Size: " + trialStack.size());
		
		System.out.println(trialStack);
		
		System.out.println("Size: " + trialStack.size());
		
		System.out.println(trialStack.pop());
		System.out.println(trialStack.pop());
		
		System.out.println("Size: " + trialStack.size());
		System.out.println("Peek: " + trialStack.peek());
		
		if(!trialStack.isEmpty())
			System.out.println("stack has items");
		
		System.out.println(trialStack.pop());
		System.out.println(trialStack.pop());
		
		if(trialStack.isEmpty())
			System.out.println("stack doesnt have items");
		
	}
	
	private static void testBurger() {
	
		Burger trialBurger = new Burger(true);
		Burger baronTrialBurger = new Burger(true);
		Burger normalTrialBurger = new Burger(false);
		trialBurger.toString();
		trialBurger.removeCategory("Veggies");
		trialBurger.removeIngredient("Ketchup");
		trialBurger.addPatty();
		trialBurger.changePatties("Veggie");
		trialBurger.toString();
		System.out.println(trialBurger.toString());
		trialBurger = new Burger(false);
		trialBurger.addCategory("Veggies");
		trialBurger.addIngredient("Mustard");
		trialBurger.removeIngredient("Mayonnaise");
		trialBurger.addPatty();
		trialBurger.addPatty();
		trialBurger.changePatties("Beef");
		System.out.println(trialBurger.toString());	
		
	}

}
