package make1;

public class month_offset {
	
	public static int month_offset( int month )
	{
		int result=0;
		
		if (month == 1){
			result = 1;      // Your code goes in here.
		}else if (month ==2){
			result = 4;
		}else if (month ==3 ){
			result = 4;
		}else if (month ==4 ){
			result = 0;
		}else if (month ==5 ){
			result = 2;
		}else if (month == 6 ){
			result = 5;
		}else if (month ==7){
			result =0;
		}else if (month == 8){
			result = 3;
		}else if (month ==9){
			result = 6;
		}else if (month == 10){
			result = 1;
		}else if (month == 11){
			result = 4;
		}else if (month ==12){
			result = 6;
		}
		
		return result;

}
}
