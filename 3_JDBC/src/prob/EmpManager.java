package prob;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.jdbcUtil;

public class EmpManager {
	public static void printEmployee(String jobs[]) {
		Connection con = null;
		Statement st = null;
		PreparedStatement ps = null; // 변수 binding에 사용
		ResultSet rs = null;

//		String sql = "select employee_id , first_name,salary " + 
//				"from employees e join jobs j " + 
//				"on e.job_id = j.job_id " + 
//				"where j.job_title =? or j.job_title =?";
		
		String sql = "select e.employee_id , e.first_name,e.salary " + 
				"from employees e join jobs j " + 
				"on e.job_id = j.job_id " + 
				"where j.job_title in(?,?)";
		try {
			con = jdbcUtil.getConnection();
			ps = con.prepareStatement(sql);

			ps.setString(1, jobs[0]);
			ps.setString(2, jobs[1]);
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.print(rs.getString("employee_id") + "    ");
				System.out.print(rs.getString("first_name") + "    ");
				System.out.print(rs.getString("salary") + "    ");
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			jdbcUtil.closeResource(con, rs, ps);
		}
	}
}
