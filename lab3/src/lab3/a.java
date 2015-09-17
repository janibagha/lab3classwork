package lab3;

public class a {

	public static void main(String[] args) {
		shapes [ ] shapeList = new shapes[5];
        shapeList[0] = new circle(3);
        shapeList[1] = new rect(1, 4);
        shapeList[2] = new rect(2, 7);
        shapeList[3] = new circle(2);
        shapeList[4] = new squre(5.0);
        for (int i = 0; i < shapeList.length; i++)  {
        	System.out.print (shapeList[i].toString( ) + " ");
	System.out.print (shapeList[i].area( ) + " ");
	System.out.println (shapeList[i].perimeter( ));
        }
   }


	}
