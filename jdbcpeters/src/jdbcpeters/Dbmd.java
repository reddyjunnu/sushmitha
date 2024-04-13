package jdbcpeters;
	import java.sql.*;  
	class Dbmd{  
	public static void main(String args[]){  
	try{  
	Class.forName("oracle.jdbc.driver.OracleDriver");  
	  
	Connection con=DriverManager.getConnection(  
	"jdbc:oracle:thin:@localhost:1521:xe","system","oracle");  
	DatabaseMetaData dbmd=con.getMetaData();  
	  
	System.out.println("Driver Name: "+dbmd.getDriverName());  
	System.out.println("Driver Version: "+dbmd.getDriverVersion());  
	System.out.println("UserName: "+dbmd.getUserName());  
	System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());  
	System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());  
	  
	con.close();  
	}catch(Exception e){ System.out.println(e);}  
	}  
	}  
