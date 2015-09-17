package lab3;

public class circle extends shapes

{

	double radius;
	public circle(int rad)
	{
		super("circle");
		
	}
	public double area()
	 {
		 return (Math.PI*radius*radius);
		 
	 }
	public double perimeter(){
		
		return 2*Math.PI*radius*radius;
	}
	 

	 
}
