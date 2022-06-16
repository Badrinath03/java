import java.sql.SQLException;
import java.util.Scanner;
public class TestCRUD {
public static void main(String[] args) throws SQLException  {
student s = new student();
Scanner sc = new Scanner(System.in);
int ch;
do {
System.out.println("1. INSERT \n 2. DISPLAY \n 3. UPDATE \n 4. DELETE \n 5. EXIT");
System.out.println("Enter your choice from 1-5");
ch = Integer.parseInt(sc.nextLine());
System.out.println("-----------------------------");
switch (ch) {
case 1:
    s.savestudent();
    break;
case 2:
    s.fetchstudent();
    break;
case 3:
    s.updatestudent();
    break;
case 4:
    s.deletestudent();
    break;
case 5:
    System.exit(0);
}
} while (ch!=5);
}
}
