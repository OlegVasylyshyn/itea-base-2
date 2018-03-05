package week5.object;

import java.util.Objects;

public class User implements Cloneable {

    private String name;
    private String pass;
    private int age;
    private Address address;

    public User() {
    }

    public User(User user) {
        this.name = user.name;
        this.pass = user.pass;
        this.age = user.age;
        this.address = new Address(user.address);
    }

    public User(String name, String pass,
                int age, String city,
                String street) {
        this.name = name;
        this.pass = pass;
        this.age = age;
        this.address = new Address(street, city);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name) &&
                Objects.equals(pass, user.pass) &&
                Objects.equals(address, user.address);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, pass, age, address);
    }

    public User clone() {
        try {
            User clone = (User) super.clone();
            clone.address = address.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("name='").append(name).append('\'');
        sb.append(", pass='").append(pass).append('\'');
        sb.append(", age=").append(age);
        sb.append(", address=").append(address);
        sb.append('}');
        return sb.toString();
    }

    protected void finalize() {
        System.out.println("I was killed");
    }
}
