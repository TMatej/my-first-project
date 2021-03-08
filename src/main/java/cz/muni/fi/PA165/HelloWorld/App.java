package cz.muni.fi.PA165.HelloWorld;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

	for (String argument : args)
	{
	    System.out.println( argument );
	}
    }
}
