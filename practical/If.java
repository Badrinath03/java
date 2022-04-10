import java.util.Scanner;
class If{
public void display()
{
Scanner s=new Scanner(System.in);
System.out.println("Enter Time");
int time=s.nextInt();


if(time<12)
{
   System.out.println("HI....Good Mrng");
}
else if(time<17)
{
    System.out.println("HI....Good Aftrnn");
}
else if(time<21)
{
     System.out.println("HI....Good EVg");
}
else
{
      System.out.println("HI....Good N8");
}
}


public static void main(String args[])
{
If obj=new If();
obj.display();
}
}