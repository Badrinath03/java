import java.util.Scanner;
class Ifage{
public void display()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter Age");
int Age=s.nextInt();


if(Age>=18)
{
   System.out.println("You are elgible");
}
else
{
   System.out.println("You are not elgible");
}
}

public static void main(String args[])
{
Ifage obj=new Ifage();
obj.display();
}
}