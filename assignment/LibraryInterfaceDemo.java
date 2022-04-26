import java.util.Scanner;
class AdultUser implements LibraryUser {
int age;
String bookType;
Scanner s = new Scanner(System.in);
@Override
public void registerAccount() {
System.out.println("Enter age :");
int age = s.nextInt();
if (age>12) {
System.out.println("You have successfully registered to adult account");
} else {
System.out.println("Sorry,age must be greater than 12 to register as an adult");
}

}
@Override
public void requestBook() {
System.out.println("Enter bookType :");
String bookType = s.next();
if (bookType=="Fiction") {
System.out.println("Book issued succesfully,please return the book within 7 days");
} else {
System.out.println("oops you are allowed to take onlu adult books");
}	
}
}
class KidUsers implements LibraryUser {
int age;
String bookType;
Scanner s = new Scanner(System.in);
@Override
public void registerAccount() {
System.out.println("Enter age :");
int age = s.nextInt();
if (age<12) {
System.out.println("You have succesfully registered under a kids account");
} else {
System.out.println("Sorry age must be less than 12 to register as a kid");	
}
}
@Override
public void requestBook() {
System.out.println("Enter bookType :");
String bookType = s.next();
if (bookType=="Kids") {
System.out.println("Book issued succesfully please return the book within 10 days");
} else {
System.out.println("You are allowed to take only kids books");
}	
}
}
interface LibraryUser {
void registerAccount();
void requestBook();
}
class LibraryinterfaceDemo  {
public static void main(String[] args) {
KidUsers k = new KidUsers();
k.registerAccount();
k.requestBook();
AdultUser a = new AdultUser();
a.registerAccount();
a.requestBook();
}
}