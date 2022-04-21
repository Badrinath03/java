class Bank {
int getRateOfInterest() {
return 0;
}
}
class SBI extends Bank {
int getRAteOfInterest() {
return 8;
}
}
class ICICI extends Bank {
int getRateOfInterest() {
return 7;
}
}
class Axis extends Bank {
int getRateOfInterest() {
return 6;
}
}
class OverridingExample {
public static void main(String args[]) {
SBI s = new SBI();
ICICI i = new ICICI();
Axis a = new Axis();

System.out.println("SBI Rate of Interest :" + s.getRateOfInterest());
System.out.println("ICICI Rate of Interest :" + i.getRateOfInterest());
System.out.println("SBI Rate of Interest :" + a.getRateOfInterest());
}
}
