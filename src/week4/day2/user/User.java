package week4.day2.user;

import java.util.Date;

public final class User {

    private final String id;
    private final String firstName;
    private final String lastName;
    private final Date birthDate;
    private final String password;


    public User(String id, String firstName, String lastName, Date birthDate, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id='").append(id).append('\'');
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", birthDate=").append(birthDate);
        sb.append(", password='").append("******").append('\'');
        sb.append('}');
        return sb.toString();
    }

    // Pattern builder
    public static class UserBuilder {

        private String id;
        private String firstName;
        private String lastName;
        private Date birthDate;
        private String password;

        public UserBuilder() {
        }

        public UserBuilder setId(String id){
            this.id = id;
            return this;
        }

        public UserBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder setBirthDate(Date birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public UserBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public User build(){
            return new User(id, firstName, lastName, birthDate, password);
        }
    }

}
