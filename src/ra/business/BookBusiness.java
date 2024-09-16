package ra.business;

import ra.entity.BookType;
import ra.util.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BookBusiness {

    public static List<BookType> getAllBookType(){
        List<BookType> bookTypes = new ArrayList<>();
        Connection connection = null;
        try {
            connection = ConnectionDB.openConnection();
            PreparedStatement statement = connection.prepareStatement("select * from bookType");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                BookType bookType = new BookType();
                bookType.setTypeId(resultSet.getInt("id"));
                bookType.setTypeName(resultSet.getString("name"));
                bookType.setDescription(resultSet.getString("Mô tả"));
                bookType.setDeleted(resultSet.getBoolean("Trạng thái"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            ConnectionDB.closeConnection(connection);
        }

        return bookTypes;
    }

    public static boolean createBookType(BookType bookType){
        Connection connection = null;

        try {
            // tạo đối tượng kết nối
            connection = ConnectionDB.openConnection();
            // Tạo đối tượng PreparedStatement
            String sql = "insert into BookType(TypeName ,Description) values(?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            // set các giá trị của tham số trong sql của prepareStatement
            statement.setString(1, bookType.getTypeName());
            statement.setString(2, bookType.getDescription());
            //thực thi câu truy vấn
            statement.executeUpdate();
            return true;
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(connection);
        }

        return false;
    }
}
