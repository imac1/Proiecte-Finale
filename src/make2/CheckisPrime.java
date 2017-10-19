package make2;

public class CheckisPrime {

	public static void main(String[] args) {
		
		for (int i = 0; i < 100; i++){
			if (isPrime.isPrime(i) == true){
				System.out.println( i + " <" );
			}else if (isPrime.isPrime(i) == false){
				System.out.println(i);
			}
		}	
	}
}
