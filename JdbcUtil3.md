***
//내가 포기 할 때까진 아직 끝난 게 아니다
***
```ruby

package day_12_15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil {

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		// DBMS와 연결하기
		String url = "jdbc:mysql://127.0.0.1/db1";
		String username = "user1";
		String pass = "1234";
		Connection conn = DriverManager.getConnection(url, username, pass);
		
		return conn;
	}

	public static void close(Statement stmt, Connection conn) {
		try {
			if(stmt != null) stmt.close();
		} catch (SQLException e) {
		}
		try {
			if(conn != null) conn.close();
		} catch (SQLException e) {
		}
	}
}

```
