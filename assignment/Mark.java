import java.util.Scanner;
class Mark
{
public void display()
{
	Scanner s=new Scanner(System.in);
	System.out.println("ENTER MARKS");
	int marks=s.nextInt();

if(marks>=35&&marks<45)
{
	System.out.println("D Grade");
}
else if(marks>=45&&marks<55)
{
	System.out.println("C Grade");
}
else if(marks>=75&&marks<85)
{
	System.out.println("A Grade");
}
else if(marks>=85&&marks<100)
{
	System.out.println("O Grade");
}
else
{
	System.out.println("Fail/Absent");
}
}
public static void main(String args[])
{
	Mark obj=new Mark();
	obj.display();
} 
}