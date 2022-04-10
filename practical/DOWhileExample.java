class DOWhileExample{
	
public void show () 
{

int a=40;

do
{
System.out.println("Value IS :"+a);
a=a-10;
}
while(a>=10);
}


public static void main(String args[])
{


DOWhileExample obj = new DOWhileExample();
obj.show();


}
}