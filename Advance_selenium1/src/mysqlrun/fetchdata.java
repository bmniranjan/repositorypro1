package mysqlrun;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class fetchdata {
	@Test
	public void getData() throws SQLException
	{
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jyothidata","root","root");
		Statement crn = con.createStatement();
		ResultSet result = crn.executeQuery("select * from data1");
		
		while(result.next())
		{
			String s1 = result.getString(1);
			String s2 = result.getString(2);
			System.out.println(s1+"    "+s2);
		}
	}

}
