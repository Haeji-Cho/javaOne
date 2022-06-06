package workspace.chap18.src.challenge.two;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest {
	public static Connection makeConnection() {
		String url = "jdbc:mysql://localhost/fruits?serverTimezone=Asia/Seoul";
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			System.out.println("�����ͺ��̽� ������ ...");
			con = DriverManager.getConnection(url, "root", "password");
			System.out.println("�����ͺ��̽� ���� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC ����̹��� ã�� ���߽��ϴ�...");
		} catch (SQLException e) {
			System.out.println("�����ͺ��̽� ���� ����");
		}
		return con;
	}

	public static void main(String[] args) throws SQLException {
		Connection conn = makeConnection();
		Statement stmt = null;
		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			conn = DriverManager.getConnection("jdbc:mysql://localhost/fruits?serverTimezone=Asia/Seoul", "root", "password");
			System.out.println("��ü ���� ��...");
			stmt = conn.createStatement();
			String sql;
			sql = "select id, name, color, price from fruit";
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String color = rs.getString("color");
				int price = rs.getInt("price");

				System.out.print("ID: " + id);
				System.out.print(", �̸�: " + name);
				System.out.print(", ����: " + color);
				System.out.println(", ����: " + price);
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
		}
	}
}