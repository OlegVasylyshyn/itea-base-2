package week3.zoo;

public class Animal {

    private String type;
    private String name;
    private int age;

    public Animal(String type, String name, int age) {
        System.out.println("SUPER");
        this.type = type;
        this.name = name;
        this.age = age;
    }

    public Animal() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void feed(){
        System.out.println("Animal feed");
    }
}
