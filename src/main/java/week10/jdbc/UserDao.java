package week10.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

// data access object
public class UserDao {

    private Connection connection;
    private List<User> allUsers;

    public void connect() throws ClassNotFoundException, SQLException {

//        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/base1?autoReconnect=true&useSSL=false&serverTimezone=UTC";
        String user = "root";
        String password = "root";
        connection = DriverManager.getConnection(url, user, password);

    }

    public void saveUser(User user) throws SQLException {
        String sql;
        if(user.getCarId() != null) {
            sql = "insert into user (id, name, password, age, carid) values (?, ?, ?, ?, ?)";
        } else {
            sql = "insert into user (id, name, password, age) values (?, ?, ?, ?)";
        }
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setLong(1, user.getId());
        ps.setString(2, user.getName());
        ps.setString(3, user.getPassword());
        ps.setInt(4, user.getAge());

        if(user.getCarId() != null) {
            ps.setLong(5, user.getCarId());
        }

        ps.execute();
    }

    public List<User> getAllUsers() throws SQLException {
        String sql = "select * from user";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        List<User> users = new ArrayList<>();
        while (rs.next()) {
            User user = new User();

            user.setId(rs.getLong("id"));
            user.setName(rs.getString("name"));
            user.setPassword(rs.getString("password"));
            user.setAge(rs.getInt("age"));
            user.setCarId(rs.getLong("carId"));
            users.add(user);
        }

        return users;
    }

    public void updateUserPassword(long id, String newPassword) throws SQLException {
        String sql = "update user set password = ? where id = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, newPassword);
        ps.setLong(2, id);
        ps.execute();
    }
}
