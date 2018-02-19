package week3.zoo;

public class Cat extends Animal {

    private String color;
    public static int count;

    static {
        System.out.println("This will be once");
    }

    {
        count++;
        System.out.println("NON-STATIC BLOCK INITIALISATION");
    }

    public Cat(String type,
               String name,
               int age, String color){
        super(type, name, age);
        System.out.println("THIS");
        this.color = color;
    }

    public Cat(){
        super();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void feed(){
        System.out.println("Cat feed");
    }

    public String toString(){
        return "Cat - name" + getName();
    }
}
