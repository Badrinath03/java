public class OverloadingExample {
static int pulseMe(int x,int y) {
return x + y;
}
static int pulseMe(int x,int y,int z) {
return x + y + z;
}
static double pulseMe(double x,double y) {
return x + y;
}
public static void main(String args[]) {
int a = pulseMe(38,76);
int c = pulseMe(123,67,89);
double b = pulseMe(88.34,9.67);
System.out.println("int 2 argument :" + a);
System.out.println("int 3 argument :" + c);
System.out.println("Double value :" + b);
}
}