class SampleConstruct {
int a;
String name;
double b = 5.5;
sample() {
System.out.println("I am default constructor");
}
sample(int a,String name,double b) {
a=a;
name=name;
b=b;
}
public static void main(String args[]) {
sample s = new sample();
System.out.println(s.a +" "+ s.name + s.b);
}
}