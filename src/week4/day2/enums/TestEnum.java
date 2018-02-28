package week4.day2.enums;

public class TestEnum {

    public static void main(String[] args) {

        System.out.println(MyEnum.FIRST);

        MyEnum second = MyEnum.SECOND;
        MyEnum second2 = MyEnum.FIRST;

        if(second == second2) {
            System.out.println("TRUE");
        }

    }

}
