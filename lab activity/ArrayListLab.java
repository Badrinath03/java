import java.util.ArrayList;
import java.util.List;
class ArrayListLab {
public static void main(String[] args) {
List<String> al = new ArrayList<String>();
al.add("Rose");
al.add("Sunflower");
al.add("Rose");
al.add("Lily");
al.add("Daisy");
al.add("MariGold");
String element = al.get(2);
System.out.println("Get index : " + element);
System.out.println("Array list is : " + al.isEmpty());
String element1 = al.remove(4);
System.out.println("Remove index : " + element1);
System.out.println("traversing using for loop");
for (int i = 0; i < al.size(); i++) {
System.out.println(al.get(i));	
}
}
}