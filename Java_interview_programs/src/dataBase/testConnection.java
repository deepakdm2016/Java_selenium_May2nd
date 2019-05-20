package dataBase;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class testConnection {

	public static void main(String[] args) throws SQLException {

		connection conn = new connection();
		Statement stmt = conn.getConnection();

		ResultSet rs1 = stmt.executeQuery("select max(id) as id_max  from hb_student_tracker.student");
		int idMax = 0;
		while (rs1.next()) {
			idMax = rs1.getInt("id_max");
		}

	
		
		idMax++;

		boolean execute = stmt.execute("insert into hb_student_tracker.student values (" + idMax
				+ ",\"Sandeep\", \"Sanalkumar\", \"sandeep.s@tcs.com\");");
		System.out.println(execute);

		ResultSet rs = stmt.executeQuery("select * from hb_student_tracker.student");

		while (rs.next()) {
			System.out.println(rs.getString("first_name"));
		}

		
		int executeUpdate = stmt.executeUpdate("delete from hb_student_tracker.student where id=" + idMax);
		System.out.println(executeUpdate);

		int executeUpdate1 = stmt.executeUpdate("delete from hb_student_tracker.student where first_name=\"Sandeep\"");
		System.out.println(executeUpdate1);

	}

}
