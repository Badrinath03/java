class ExceptionExample {
public void show() {
String a = "i am error";
System.out.println(a);
try {
int i = 50/1;
System.out.println(i);
String s = "Mamta";
System.out.println(s.length());
int arr[] = new int [3];
arr[4] = 24;
int m = Integer.parseInt(s);
System.out.println(m);
}
catch(Exception e) {
System.out.println(e);
}
String b = "i cannot be handle";
System.out.println(a +  b);
}
public static void main(String[] args) {
ExceptionExample ep = new ExceptionExample();
ep.show();
}
}