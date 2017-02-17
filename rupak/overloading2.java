class overloading2
{
	void sum(double a, double b)
	{
		System.out.println("int() method performed");
	}
	void sum(long a,long b)
	{
		System.out.println("long() method performed");
	}
	public static void main(String args[])
	{
		overloading2 obj= new overloading2();
		obj.sum(20,20);
	}
}