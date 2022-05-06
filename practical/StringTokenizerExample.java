import java.util.StringTokenizer;
class StringTokenizerExample {
public void myy() {
StringTokenizer t = new StringTokenizer("Anudip Foundation and Career Developement Center"," ");
while (t.hasMoreTokens()) {
System.out.println(t.nextToken());
}
StringTokenizer st = new StringTokenizer("I am Mamta,Staying in Mumbai,Working in Anudip");
while (st.hasMoreTokens()) {
System.out.println("Next Token : " + st.nextToken(","));	
}
}
public static void main(String[] args) {
StringTokenizerExample m = new StringTokenizerExample();
m.myy();
}
}