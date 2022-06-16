import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Student {

   
        Scanner s = new Scanner(System.in);
        int id,phone;
        String name,DOB,dept;
       
        public void savestudent() throws SQLException{
            System.out.println("Enter student id :");
            id = s.nextInt();
            System.out.println("Enter student name :");
            name = s.next();
            System.out.println("Enter student phone :");
            phone = s.nextInt();
            System.out.println("Enter DOB :");
            DOB = s.next();
            System.out.println("Enter dept :");
            dept = s.next();
            Connection conn = Helper.con();
            PreparedStatement st = conn.prepareStatement("insert into student values(?,?,?,?,?)");
            st.setInt(1,id);
            st.setString(2,name);
            st.setInt(3,phone);
            st.setString(4,DOB);
            st.setString(5,dept);
            st.executeUpdate();

    }

        public void fetchstudent() throws SQLException{
            Connection conn = Helper.con();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from student");
            while (rs.next()) {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getString(5));
            }
        }

        public void updatestudent() throws SQLException{
            Connection conn = Helper.con();
            Statement st = conn.createStatement();
            System.out.println("Enter student id :");
            id = s.nextInt();
            System.out.println("Enter update student phone");
            phone = s.nextInt();
            st.executeUpdate("update student set phone = '"+ phone+"'where id = "+ id);
            }
           

        public void deletestudent() throws SQLException{
            Connection conn = Helper.con();
            Statement st = conn.createStatement();
            System.out.println("Enter student id :");
            id = s.nextInt();
            st.executeUpdate("Delete from student where id = "+ id);
           
        }                
}
