class overloading
{
	public static void main(int a)
	{
		System.out.println(a);
	}
	public static void main(String args[])
	{
		System.out.println("MAIN METHOD INVOKED");
		main(10);
	}
}