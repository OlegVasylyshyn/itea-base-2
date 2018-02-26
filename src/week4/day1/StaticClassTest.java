package week4.day1;

public class StaticClassTest {

    public static void main(String[] args) {

        NestedClasses.StaticClassExample myStaticClass = new NestedClasses.StaticClassExample();
        System.out.println(myStaticClass);

        NestedClasses nestedClasses = new NestedClasses("Hello");
        NestedClasses.NonStaticClassExample innerClass = nestedClasses.getInnerClass();
        System.out.println(innerClass);

        NestedClasses nestedClasses2 = new NestedClasses("World");
        NestedClasses.NonStaticClassExample innerClass2 = nestedClasses2.getInnerClass();
        System.out.println(innerClass2);


        NestedClasses.NonStaticClassExample innerClass3 =
                new NestedClasses("Some string")
                        .new NonStaticClassExample();


        nestedClasses.work();


        NestedClasses classes = new NestedClasses("") {

            private String name;

            public void work(){
                System.out.println("Override");
            }

        };

        classes.work();

    }

}
