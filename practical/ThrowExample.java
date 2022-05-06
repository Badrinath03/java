class ThrowExample {
public static void myDisplay(int a) throws ArithmeticException {
 if (a>=0 && a<=35) {
throw new ArithmeticException("Value cannot be less than 35");
}else {
System.out.println("Your are Pass");
}
}
public static void main(String[] args) {
myDisplay(0);
}
}