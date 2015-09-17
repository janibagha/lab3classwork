package lab3;

public class rect extends shapes 
{

	public double lenght,width;
	public rect (int ln, int wd )
	{
	super("rect");
	
	lenght=ln;
	width=wd;
	
	}
	
	public double area()
	{
		return (lenght*width);
		
	}
	
	public double perimeter()
	{
		return 2*(lenght*width);
		
	}
	
	
	public rect(String name)
	
	{
		super(name);
	}
}