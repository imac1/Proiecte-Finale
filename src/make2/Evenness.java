package make2;

public class Evenness
{
    public static void main (String [] args)
    {
        for ( int x = 0; x <= 20; x = x + 1 )
        {
            if ( isEven(x) == true && isDivisibleBy3(x) == false )
                System.out.println( x + " " + "<" );
            else if ( isEven(x) == false && isDivisibleBy3(x) == true )
                System.out.println( x + " " + "=" );
            else if ( isEven(x) == true && isDivisibleBy3(x) == true )
                System.out.println( x + " " + "<=" );
            else
                System.out.println(x);
        }
    }
    public static boolean isEven(int n)
    {
        boolean e;
        if (n%2==0)
            e = true;
        else 
            e = false;
        return e;
    }
    public static boolean isDivisibleBy3(int n)
    {
        boolean e;
        if (n%3==0)
            e = true;
        else 
            e = false;
        return e;
    }
}
