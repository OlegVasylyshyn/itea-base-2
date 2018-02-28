package week4.day2.user;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.UUID;

import static week4.day2.user.User.*;

public class UserTest {

    public static void main(String[] args) {

        UserBuilder ub = new UserBuilder();
        ub
                .setId(UUID.randomUUID().toString())
                .setBirthDate(new Date())
                .setFirstName("Dex")
                .setPassword("123")
                .setLastName("James");

        User user = ub.build();
        System.out.println(user);

    }

}
