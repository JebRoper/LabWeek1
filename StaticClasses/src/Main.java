public class Main {

    public static void main(String[] args) {
        Point origin = new Point(0, 0);
        System.out.println("origin is " + origin);

        Point point = new Point(1, 1);
        System.out.println("new point is " + point);

        point = new Point(11, 22);
        System.out.println("new point is " + point);

        Point origin2 = new Point(Point.ORIGIN_X, Point.ORIGIN_Y);

    }
}
