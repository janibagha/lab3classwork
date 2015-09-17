package lab3;

public class triangle extends shapes
{
public int a,b;

public triangle (int a, int b)
{
	
	super("triangle");
	
}

public double area()
{
	return 0.5*(a*b);
}
public double perimeter()
{
	return 3*(a*b);
}

}
