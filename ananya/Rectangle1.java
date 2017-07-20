class Rectangle
{
	int Rectangle(int length, int width)
	{
		int Area = length * width;
		return Area;
	}

	int Rectangle(int length)
	{
		int Area1 = length * length;
		return Area1;
	}
}
class Rectangle1
{
	public static void main(String args[])
	{
		Rectangle rect1 = new Rectangle();
		int area = rect1.Rectangle (20, 30);		
		
			
		System.out.println("Area of the rectangle: " + area);		
	}
}
