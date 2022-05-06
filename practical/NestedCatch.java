import java.util.InputMismatchException;
import java.util.Scanner;
class NestedCatch {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.println("Enter Two Numbers");

try {
int x = s.nextInt();
int y =	s.nextInt();
System.out.println(" " + (x/y));
}
catch (InputMismatchException e) {
System.out.println("java.util.InputMismatchException");
}
catch (Exception e) {
	System.out.println(e);
}
}
}