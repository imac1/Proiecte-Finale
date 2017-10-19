package make2;

public class power {

	public static int power(double a, double b)
	{
	    double result = 1;
	    while(b>0) 
	    {   
	        result = result * a; 
	        b--; 
	    }
	    return (int) result;
}
}
