package make2;

public class NumberPuzzlesI {

	public static void main(String[] args) {
		int sum=0;
		int dif=0;
		
		for (int i=10; i<=100; i++){
			for (int j=10; j<=100; j++){
				sum = i+j;
				dif = i-j;
				if ( sum == 60){
					System.out.println("\n" + i + "\n" + j );
				}else if (dif == 14){
					System.out.println("\n" + i + "\n" + j );
				}	
			}	
		}
	}

}
