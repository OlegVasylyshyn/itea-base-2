package week10.jdbc;

import java.sql.SQLException;
import java.util.List;

public class Run {

    // Persistence API - Hibernate
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        UserDao dao = new UserDao();
        dao.connect();

        System.out.println("Success connection");

//        dao.saveUser(new User(5L, "Kirck", "123", 50, null));
//        System.out.println("User was successfully persisted");

//        List<User> users = dao.getAllUsers();
//        System.out.println(users);

        dao.updateUserPassword(1, "newNewPassword");
    }

}
