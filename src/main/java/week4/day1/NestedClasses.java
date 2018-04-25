package week4.day1;

public class NestedClasses {

    private static String staticSting = "static";
    private String nonStaticSting;

    public NestedClasses(String nonStaticSting) {
        this.nonStaticSting = nonStaticSting;
    }

    public static class StaticClassExample {
        @Override
        public String toString() {
            return "PublicStaticClass " + staticSting;
        }
    }

    public class NonStaticClassExample {
        @Override
        public String toString() {
            return "NonStaticClassExample " + nonStaticSting;
        }
    }

    public NonStaticClassExample getInnerClass(){
        return new NonStaticClassExample();
    }

    public void work(){

        class MethodLocalInnerClass{

            private String name;

            @Override
            public String toString() {
                return "I can see non-static fields - " + nonStaticSting;
            }

        }

        MethodLocalInnerClass mlic = new MethodLocalInnerClass();
        System.out.println(mlic);

    }

}
