class Metal {
String weight ="100kg";
String color ="Golden";
}
class Gold extends Metal {
String hue ="Hue";
}
class SampleInherit {
public static void main(String[]args) {
Gold g = new Gold();
System.out.println("Metal weight is :" + g.weight);
System.out.println("Metal color is :" + g.color);
}
}