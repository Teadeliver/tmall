package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author littlestar
 */
public class DbUtil {
    private static final String HOST = "localhost";
    private static final int PORT = 3306;
    private static final String DATABASE = "tmall";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "111222333";
    private static final String ENCODING = "utf-8";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        String url = String.format("jdbc:mysql://%s:%d/%s?characterEncoding=%s", HOST, PORT, DATABASE, ENCODING);
        return DriverManager.getConnection(url, USERNAME, PASSWORD);
    }
}
