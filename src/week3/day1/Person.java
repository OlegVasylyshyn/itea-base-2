package week3.day1;

// POJO class
// Java beans
public class Person {

    private int age;
    private String name;
    private String mobilePhone;
    private boolean single = true;

    public Person(int age,
                  String name,
                  String mobilePhone) {

        this.age = age;
        this.name = name;
        this.mobilePhone = mobilePhone;
    }

    public Person(){
    }

    public void greeting(){
        System.out.println("I am - " + name);
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age > 0)
            this.age = age;
    }

    public void setSingle(boolean single) {
        this.single = single;
    }

    public boolean isSingle(){
        return single;
    }

}
