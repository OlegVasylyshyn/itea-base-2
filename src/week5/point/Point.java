package week5.point;

import java.util.Objects;

public class Point {

    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}

class ColorPoint {

    Point point;
    Color color;

    public ColorPoint(int x, int y, Color color) {
        this.point = new Point(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ColorPoint)) return false;
        ColorPoint that = (ColorPoint) o;
        return Objects.equals(point, that.point) &&
                color == that.color;
    }

    @Override
    public int hashCode() {

        return Objects.hash(point, color);
    }
}

enum Color {

    RED, BLACK

}
