package test201812;

import java.sql.SQLException;

//mysql jdbc get test
public class SqlExcuteMysql {

	public static void main(String [] args){
		MysqlJdbc myjdbc=new MysqlJdbc
				("fordream", "cc08CC08","fordream","jdbc:mysql://39.107.234.205:3306/");
		String sqlCreate="create table  if not exists test_jdbc(id int,name varchar(10),des varchar(30));";
		String sql="insert into test_jdbc(id,name,des) values (1,'hww','jdbc≤Â»Î≤‚ ‘');";
		System.out.print("create table complete!!!");
		try {
			java.sql.Statement stmt=myjdbc.getStatement();
			stmt.execute(sqlCreate);
			stmt.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.print(e.getMessage());
		}
		
	}
	
	
	
	
}
