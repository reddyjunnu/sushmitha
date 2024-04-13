package jdbcpeters;
import java.sql.*;
import com.mysql.cj.jdbc.Driver;
public class Main {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/peters";
		String uname ="root";
		String pwd = "Root@1234";
		String query = "update student set marks=? where stud_name=?";
		try {
			Connection c = DriverManager.getConnection(url,uname,pwd);
			DatabaseMetaData d = c.getMetaData();
			System.out.println(d.getDatabaseProductName()+""+d.getDatabaseProductVersion()+""+d.getDriverName()+""+d.getUserName()+"");
			Statement s = c.createStatement();
			PreparedStatement pstmt = c.prepareStatement(query);
			pstmt.setInt(1,23);  
			pstmt.setString(2,"junnu");
			int rowsEffected = pstmt.executeUpdate();
			 System.out.println(rowsEffected);
			 ResultSet rs = s.executeQuery("select*from Student");
			 System.out.println("stud_id\tstud_name\tmarks\tskill");
			 while(rs.next()) {
				 int id = rs.getInt("stud_id");
				 String name = rs.getString("stud_name");
				 int marks = rs.getInt("marks");
				 String skill = rs.getString("skill"); 
				 System.out.println(id+""+name+""+marks+""+skill);
			 }
			 rs.close();
			 s.close();
			 c.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}