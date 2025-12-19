import java.lang.Math;

class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getXY() {
        int[] coordinates = {x, y};
        return coordinates;
    }

    public double distance(int x, int y) {
        int xDistance = this.x - x;
        int yDistance = this.y - y;
        return Math.sqrt(xDistance * xDistance + yDistance * yDistance);
    }

    public double distance(MyPoint another) {
        int xDistance = this.x - another.x;
        int yDistance = this.y - another.y;
        return Math.sqrt(xDistance * xDistance + yDistance * yDistance);
    }

    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

class TestMyPoint {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(3, 4);

        System.out.println("Point 1: " + point1);
        System.out.println("Point 2: " + point2);

        point1.setXY(5, 6);
        System.out.println("point1 after setXY: " + point1);

        int[] coordinates = point2.getXY();
        System.out.println("Coordinates of point2: (" + coordinates[0] + ", " + coordinates[1] + ")");

        double distance1 = point1.distance(7, 8);
        System.out.println("Distance from point1 to (7, 8): " + distance1);
    }
}
