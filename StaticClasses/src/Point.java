/**
 * Created by admin on 3/29/17.
 */


public class Point {

    public static final int ORIGIN_X = 0;
    public static final int ORIGIN_Y = 0;

    private static int classCounter;
    private int x;
    private int y;


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        ++classCounter;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "x=" + x + ", y=" + y + ", instance created=" + classCounter;
    }

}
