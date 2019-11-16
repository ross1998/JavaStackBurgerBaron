import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

	private static String exceptions;
	private static String typeOneOrder;
	private static int pattyCount;
	private static int myPattyType;
	private static String typeTwoOrder;
	private static int additions;
	private static int omissions;
	private static Scanner inputLine;
	private static MyStack<String> stack = new MyStack<String>();
	static Burger myBurger;
	public static void main(String[] args) {
	
		Burger testBurger = new Burger(true);
		System.out.println(testBurger);
		testBurger.removeIngredient("Tomato");
		System.out.println(testBurger);
		//testBurger.addIngredient("Tomato");
		testBurger.addCategory("Veggies");
		System.out.println(testBurger);
		testBurger.addPatty();
		testBurger.addPatty();
		testBurger.changePatties("Beef");
		System.out.println(testBurger);

	}
	
	static void changePatties(String pattyType) {
	
	}
//static void parseLine(String line) {
//		
//		
//		try {
//			inputLine = new Scanner(Paths.get(line));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		ArrayList<String> lineList = new ArrayList<String>();
//		
//		while (inputLine.hasNextLine()) {
//			
////			pattyCount = emptyString;
////			myPattyType = emptyString;    
////			omissions = emptyString;
////			additions = emptyString;
////			exceptions = emptyString;
//			
//			//Scanner order = inputLine;
//			//testString = inputLine;
//			//System.out.println(inputLine.);
//			Scanner order = new Scanner(inputLine.nextLine());
//			
//			while (order.hasNext()) {
//				
//				String item = order.next(); //Starts at burger
//				String itemNext;
//				String itemNextNext;
//				String itemNextNextNext;
//				//String[] itemArray = new String[10];
//		
//				
//				while ((!item.equals("with") || !item.equals("but")) && order.hasNext()) {
//						
//					if(item.equals("Double") || item.equals("Triple") || item.equals("Single")) {
//						
//						pattyCount = item;
//						
//					} else {
//						
//						myPattyType = item;
//					}
//					
//					if (myPattyType == item) {
//						
//					}
//					itemNext = order.next();
//					
//					if(item.equals("Chicken") || item.equals("Baron") || item.equals("Veggie")) {
//						
//						myPattyType = itemNext;
//						//System.out.print(myPattyType + " ");
//					}
//				}
//				
//				while (order.hasNext() == true) {
//					
//					itemNextNext = order.next();
//					//System.out.print(itemNextNext);
//					
//					if (itemNextNext == "with") {
//						
//						itemNextNext = order.next();
//						
//						if (itemNextNext == "no") {
//							
//							omissions = itemNextNext;
//							//System.out.print(omissions + " ");
//							
//						} else {
//							
//							additions = itemNextNext;
//							//System.out.print(additions + " ");
//						}
//						
//					} 
//					
//					itemNextNextNext = order.next();
//					
//					if (itemNextNextNext == "but") {
//						
//						itemNextNextNext = order.next();
//						
//						if (itemNextNextNext == "no") {
//							
//							itemNextNextNext = order.next();
//							
//							exceptions = itemNextNextNext;
//							
//						} else {
//							
//							exceptions = itemNextNextNext;
//						}
//	
//					}
//				}
//			}
//			
//			typeOneOrder = (pattyCount + myPattyType + "Burger Baron with no " + additions + "but" + omissions);
//			typeTwoOrder = (pattyCount + myPattyType + "Burger with " + additions + "but no" + exceptions);			
//			
//		}
//		System.out.println(typeOneOrder);
//		System.out.println(typeTwoOrder);
//		
//	}

}
