import java.util.Scanner;
class Switch{
public void display()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter DAY");
int DAY=s.nextInt();

switch(DAY)
{
case 1:
System.out.println("Its Monday...");
break;
case 2:
System.out.println("Its Tueday...");
break;
case 3:
System.out.println("Its Wednesday...");
break;
case 4:
System.out.println("Its Thursday...");
break;
case 5:
System.out.println("Its Friday...");
break;
case 6:
System.out.println("Its Stuarday...");
break;
case 7:
System.out.println("Its Sunday...");
break;
default:
System.out.println("No days are available");

}
}

public static void main(String args[])
{
Switch obj=new Switch();
obj.display();
}
}