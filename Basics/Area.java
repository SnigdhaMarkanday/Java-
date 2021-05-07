//Snigdha Markanday's Code

public class Area{
	void area(float x, float y) {
		double z = 0.5*x*y;
		System.out.println("the area of the rectangle is "+z+" sq units");
	}
    void area(float x)
    {
        System.out.println("Area of the square is "+Math.pow(x, 2)+" sq units");
    }
    
    void area(double x)
    {
        double z = 3.14 * x * x;
        System.out.println("the area of the circle is "+z+" sq units");
    }
}
class forArea
{
     public static void main(String args[]) 
	{
	   Area ob = new Area();
	   ob.area(8,5);
	   ob.area(7);
	   ob.area(6.5);
    }
}
