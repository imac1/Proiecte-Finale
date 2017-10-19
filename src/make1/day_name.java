package make1;

public class day_name {
	public static String day_name( int day )
	{
		 String result = "";
		
		if ( (day%6) ==1){
			result = "Monday";
		}else if ((day%6) == 2){
			result = "Tuesday";
		}else if ((day%6)==3){
			result  = "Wednesday";
		}else if ((day%6) ==4){
			result  = "Thursday";
		}else if ((day%6) ==5){
			result = "Friday";
		}else if ((day%6) ==6){
			result = "Saturday";
		}else if((day%6) ==7){
		result = "Sunday";	
		}
		return result;
	}

}
