import java.util.Scanner;
class InvalidAgeException extends Exception {
public InvalidAgeException(String str) {
super(str);	
}
}
class CustomExceptionExample {
public void checkAge(int age) throws InvalidAgeException {
if (age<=18 || age>=25) {
throw new InvalidAgeException("Invalid age for enrolling into java course");	
} else {
System.out.println("proper age for enrolling in java course");
}
}
public static void main(String[] args) throws InvalidAgeException {
CustomExceptionExample c = new CustomExceptionExample();
Scanner s = new Scanner(System.in);
System.out.println("Enter your age");
int age = s.nextInt();
c.checkAge(age);
}
}