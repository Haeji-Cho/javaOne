package workspace.chap18.src.sec05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB1Demo {
	public static Connection makeConnection() {
		String url = "jdbc:mysql://localhost/contacts?serverTimezone=Asia/Seoul";

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
            System.out.println(e.getMessage());
		}
		return con;
	}

	public static void main(String[] args) {
		makeConnection();
	}
}