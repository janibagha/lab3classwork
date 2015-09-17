package lab3;

public abstract class shapes {

	protected String shapename ;
	public shapes (String name )
	{
		
		shapename=name;
	}	
	
	public abstract double area();
	public abstract double perimeter(); 
	
}
