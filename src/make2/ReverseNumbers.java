package make2;

public class ReverseNumbers {
	public static void  ReverseNumbers(){
		for (int i=0; i<=9; i++){
			for (int j=1; j<=9; j++){
			int number1 = i*10+j;
			int number2 = j*10+i;
			int calculus = number1 - number2;
				if ( calculus == i+j ){
					System.out.println(i+ "" + j + "," + number1 +"-" + number2 + " =" + i + "-" + j + "="+ calculus);
				}
	}
}return;
	
	
}

}
