package make2;

public class EvennessFunction {

	public static void main(String[] args) {
	
		int i;
		
		for (i=0; i < 20; i++){
			if ( isEven.isEven(i) == true && isDivisibleBy3.isDivisibleBy3(i) == false )
                System.out.println( i + " " + "<" );
            else if ( isEven.isEven(i) == false && isDivisibleBy3.isDivisibleBy3(i) == true )
                System.out.println( i + " " + "=" );
            else if ( isEven.isEven(i) == true && isDivisibleBy3.isDivisibleBy3(i) == true )
                System.out.println( i + " " + "<=" );
            else
                System.out.println(i);
		}
		
	
	}
}
	

