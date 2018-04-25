package week5.point;

public class TestPoint {

    public static void main(String[] args) {

        Point x = new Point(1, 2);

        ColorPoint y = new ColorPoint(1, 2, Color.BLACK);
        ColorPoint z = new ColorPoint(1, 2, Color.RED);

        Point point = new Point(1, 2) {


        };


        System.out.println(point.x);

    }

}
