package week10.jdbc;

public class User {

    private Long id;
    private String name;
    private String password;
    private Integer age;
    private Long carId;

    public User() {
    }

    public User(Long id, String name, String password, Integer age, Long carId) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.carId = carId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", age=").append(age);
        sb.append(", carId=").append(carId);
        sb.append('}');
        return sb.toString();
    }
}
