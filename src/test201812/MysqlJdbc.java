package test201812;



import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlJdbc {
   private String username;
   private String password;
   private String url;
   private String dbName;
   
   public MysqlJdbc(String username,String password,String dbName,String url){
	   this.username=username;
	   this.password=password;
	   this.url=url;
	   this.dbName=dbName;
   }
   public java.sql.Connection getMysqlConnection(){
	   java.sql.Connection conn=null;
	   StringBuffer urlBuffer=new StringBuffer();
	   urlBuffer.append(this.url);
	   urlBuffer.append(this.dbName);
	   urlBuffer.append("?user=");
	   urlBuffer.append(this.username);
	   urlBuffer.append("&password=");
	   urlBuffer.append(this.password);
	   
	  String connUrl =urlBuffer.toString();
	   try {
		Class.forName("com.mysql.jdbc.Driver");
		conn=DriverManager.getConnection(connUrl);
	 } catch (ClassNotFoundException e) {
		 System.out.println("加载驱动异常");
		 e.printStackTrace();
	   }
	   catch (SQLException e) {
	    System.out.println("数据库异常");
		 e.printStackTrace();
		}
	return conn;
   }
//   get statement
   public Statement getStatement(){
	   Statement stms=null;
	 try {
		 stms=  getMysqlConnection().createStatement();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return stms;
   }
   
   
   
   
   
   
	
	
	
}
