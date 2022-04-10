class Variable
{
	public void display()
	{
	  int no1=15;
	  int no2=120;
	  int sum=no1+no2;
	  System.out.println("THE SUM IS:"+sum);
	  }
	String a;
	int b;
	double c =54.25;

	static int d=20;
	public static void main(String[] args) {
		Variable obj =new Variable();
		obj.display();
		
	System.out.println(obj.a);
	System.out.println(obj.b);
	System.out.println(obj.c);
	
	System.out.println("Static Variable->" +d);
	
	}

}