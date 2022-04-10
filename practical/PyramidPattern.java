class PyramidPattern
{
public void pattern(int num)
{
for(int i=0;i<num;i++){	//number of rows
  for(int j=0;j<=i;j++){     //number of columns
	  System.out.print("*");
   }

   System.out.println();
}
}
public static void main(String args[])
{
	
	PyramidPattern P=new PyramidPattern();
	int num=8;
	P.pattern(num);
}
}