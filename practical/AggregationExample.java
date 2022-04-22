class Address {
String street,city,state,country;
int pincode;

public Address(String street,String city,String state,String country,int pincode) {
this.street = street;
this.city = city;
this.state = state;
this.country = country;
this.pincode = pincode;
}
}
class Student {
int studentId;
String studentName,courseName,centerName;
Address addr;

public Student(int studentId,String studentName,String courseName,String centerName,Address addr) {
this.studentId = studentId;
this.studentName = studentName;
this.courseName = courseName;
this.centerName = centerName;
this.addr = addr;
}

public void display() {
System.out.println("Id is :" +studentId +" " +"Name is :" +studentName +" " +"Course is :" +courseName +" "+"Center is :" +centerName);
System.out.println(addr.street+" "+addr.city+" "+addr.state+" "+addr.country+" "+addr.pincode);
}
}
class AggregationExample {
public static void main(String args[]) {
Address a = new Address("XYZ street","mumbai","MH","India",400705);
Address a1 = new Address("ABC road","Chennai","TN","India",600073);

Student s = new Student(101,"Mamta","Java","Chennai",a);
Student s1 = new Student(102,"Ram","Dot.net","Kolkata",a1);
s.display();
s1.display();
}
}
