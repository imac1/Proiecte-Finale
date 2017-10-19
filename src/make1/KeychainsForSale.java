package make1;
import java.util.Scanner;

public class KeychainsForSale {
	
	
	private static int keychainsnumber;
	private static int price;
	private static int cost;

	private static int OrderShippingCost;
	private static int KeyChainShippingCost;
	private static double SalesTax;

	public static void main( String[] args )
	
	{
	Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Ye Olde Keychain Shoppe");
		
		boolean n=true;
		int keychainsnumber=0;
		int price = 10;
		double  SalesTax = (double) 0.825;
		int KeyChainShippingCost = 1;
		int OrderShippingCost = 5;
		
		
		while (n==true){
			
			System.out.println("1. Add Keychains to Order");
			System.out.println("2. Remove Keychains from Order");
			System.out.println("3. View Current Order");
			System.out.println("4. Checkout");
			System.out.println("Please enter your choice:");
			int choice = keyboard.nextInt();
			if (choice ==1){
				add_keychains();
				
			}else if (choice ==2 ){
				remove_keychains();
				
			}else if (choice ==3){
				System.out.println(" VIEW ORDER " );
				view_order();
				
			}else if (choice ==4){
				checkout();
				n=false;
			} else if (choice < 0){
				System.out.println("please, enter a positive value" );
				
			}else if (choice > 4 ){
				System.out.println("please, enter a value between 1 & 4");
				
			}
		}   
	}
	
	private static void add_keychains() {
		
	
		
		Scanner keyboard = new Scanner(System.in);
		// TODO Auto-generated method stub
		 System.out.println("You have " + keychainsnumber + " keychains"  ); 
		 System.out.println("How many to add?");
		 int keyplus = keyboard.nextInt();
		 keychainsnumber += keyplus;
		 System.out.println(" You have now " + keychainsnumber + " keychains" );
		 return ;
	}
	
	private static void remove_keychains() {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("You have " + keychainsnumber + " keychains"  ); 
		 System.out.println("How many to remove?");
		 int keyplus = keyboard.nextInt();
		 keychainsnumber -= keyplus;
		 System.out.println(" You have now " + keychainsnumber + " keychains" );
		 return ;
	}

	private static void view_order(){
		int price=10;
		double  SalesTax = (double) 0.825;
		int KeyChainShippingCost = 1;
		int OrderShippingCost = 5;
		
		System.out.println("You have " + keychainsnumber + " keychains"  );
		System.out.println(" price per keychain " + price );
		System.out.println("sales tax: " + SalesTax);
		
		int cost = keychainsnumber*price;
		
		System.out.println("order cost: " + cost );
		int baseShipping = KeyChainShippingCost*keychainsnumber;
		System.out.println(" shipping cost per keychain " + KeyChainShippingCost );
		System.out.println("base shipping cost "  + baseShipping);
		System.out.println("order shipping cost" + OrderShippingCost );
		
	System.out.println(" TOTAL COST: " + cost + SalesTax + baseShipping + OrderShippingCost );		
return;
	}
	
	private static void checkout(){
		int price=10;
		double  SalesTax = (int) 0.825;
		int KeyChainShippingCost = 1;
		int OrderShippingCost = 5;
		
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println(" What is your name?" );
		String name =  keyboard.nextLine();
		
		System.out.println("You have " + keychainsnumber + " keychains"  );
		System.out.println(" Keychains cost $10 each.");
		int cost = keychainsnumber*price;
		
		System.out.println("order cost: " + cost );
		int baseShipping = KeyChainShippingCost*keychainsnumber;
		System.out.println(" shipping cost per keychain " + KeyChainShippingCost );
		System.out.println("base shipping cost "  + baseShipping);
		System.out.println("order shipping cost" + OrderShippingCost );
		
	System.out.println(" TOTAL COST: " + cost + SalesTax + baseShipping + OrderShippingCost );		
		System.out.println(" Thanks for your order," + name + "!" );
		return;
	}
}
