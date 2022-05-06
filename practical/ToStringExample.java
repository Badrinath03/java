class ToStringExample {
int rollno;
String name,addr;
ToStringExample(int rollno,String name,String addr) {
this.rollno = rollno;
this.name = name;
this.addr = addr;
}
public String toString() {
return super.toString();
}
public static void main(String[] args) {
ToStringExample s = new ToStringExample(1,"Ram","Mumbai");
ToStringExample s2 = new ToStringExample(2,"Karan","Delhi");

System.out.println(s);
System.out.println(s2);
}
}