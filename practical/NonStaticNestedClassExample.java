class NonStaticNestedClassExample {
int a = 25;
private int b = 45;
class Inner {
int res = a + b;
void show() {
System.out.println("Value of res :" + res);
}
}
public static void main(String[] args) {
NonStaticNestedClassExample c = new NonStaticNestedClassExample();	
NonStaticNestedClassExample.Inner i = c.new Inner();
i.show();
}
}