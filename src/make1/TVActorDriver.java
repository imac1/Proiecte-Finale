package make1;

public class TVActorDriver {
	
	public static void main( String[] args ) {
		          TVActor a = new TVActor();
		          a.name = "Thomas Middleditch";
		          a.role = "Richard Hendricks";
		          a.age = 15;
		  
		         TVActor b = new TVActor();
		          b.name = "Martin Starr";
		          b.role = "Bertram Gilfoyle";
		          b.age = 5;
		 
		         TVActor c = new TVActor();
		         c.name = "Kumail Nanjiani";
		         c.role = "Dinesh Chugtai";
		         c.age = 8;
		 
		         System.out.println( a.name + " played " + a.role + " and is " + a.age);
		         System.out.println( b.name + " played " + b.role + " and is " + b.age);
		         System.out.println( c.name + " played " + c.role );
		         
		         
		         
		     }
		 }

