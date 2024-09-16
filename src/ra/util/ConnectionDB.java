package ra.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String ULR = "jdbc:mysql://localhost:3306/MD2_KiemTra";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "240603";

    //xây dựng phương thức tạo đối tượng Connection kết nối java với CSDL
    public static Connection openConnection(){
        Connection connection = null;

        try {
            //đăng ký driver cho driverManagerdđể biết kết nối đến CSDL nào
            Class.forName(DRIVER);
            //tạo đối tượng connection từ driverManager
            connection = DriverManager.getConnection(ULR, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

    //phương thức đóng kết nối
    public static void closeConnection(Connection connection){
        if(connection != null){
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
