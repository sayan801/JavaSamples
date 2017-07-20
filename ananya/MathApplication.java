class MathOperation
{
	static int mul(int x, int y)
	{
		return (x * y);
	}
	static float divide(int x, int y)
	{
		return (x / y);
	}
}
class MathApplication
{
	public static void main(String args[])
	{
		int a = MathOperation.mul(10, 5);
		float b = MathOperation.divide(a, 2);
		System.out.println("b = " +b);
	}
}
