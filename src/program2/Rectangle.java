package program2;
import java.util.Scanner;
public class Rectangle {
float length=1.0f;
float width = 1.0f;
public float area()
{
	return length*width;
}
public float perimeter()
{
	return 2*(length+width);
}
public float getlength()
{
	return length;
}
public float getwidth()
{
	return width;
}
public void setlength(float len)
{
	if(len>0 && len<20)
	{
		length = len; 
	}
	else
	{
		System.out.println("invalid length");
	}
}
public void setwidth(float wid)
{
	if(wid>0 && wid<20)
	{
		width = wid; 
	}
	else
	{
		System.out.println("invalid width");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle object1 =  new Rectangle();
		Scanner input= new Scanner(System.in);
		float length,width;
		System.out.println("Enter length");
		length = input.nextFloat();
		System.out.println("Enter width");
		width = input.nextFloat();
		object1.setlength(length);
		object1.setwidth(width);
		System.out.printf("length=%f",object1.getlength());
		System.out.printf("width=%f",object1.getwidth());
		System.out.printf("area=%f",object1.area());
		System.out.printf("perimeter=%f",object1.perimeter());
	}

}
