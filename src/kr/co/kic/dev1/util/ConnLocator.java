package kr.co.kic.dev1.util;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConnLocator {
	public static Connection getConnection() {
		DataSource ds = null;
		Connection con = null;
		try {
			Context context = new InitialContext();
			//java:comp/env/ ����
			//jdbc/kic => context.xml�� name�Ӽ� ���� ��ġ�ؾ� �Ѵ�.
			ds = (DataSource)context.lookup(
					"java:comp/env/jdbc/kic");
			//ds.getConnection()��  Connection Pool�� �̹� �������
			//Connection ��ü�� �����´�. 
			//�ٽø��ؼ� �� �������� Connection ��ü�� �����ϴ� ���� �ƴ϶�
			//�̹� ������� Connection ��ü�� ����ϴ� ���̴�.
			con = ds.getConnection();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		
	}
}
