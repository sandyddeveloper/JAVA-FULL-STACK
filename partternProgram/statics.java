class statics
{
	// global area
	static int a = 10; // static varaible // class variable
	static String num = "two";
	static long res =64646;
		
	
	static void m1() // static method it also know as class method
	{
		//local area
		System.out.println(a);// by using varaible name 
		System.out.println(statics.num);// by using class name
	 
		statics s1 = new statics(); // object created
		System.out.println(s1.res);// by using object	
	}
	
	
	public static void main(String[] args)  // 2nd
	{
		System.out.println("Hello World!");
		m1();
	}
	
	
}
