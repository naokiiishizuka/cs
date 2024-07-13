package csMiddle.object.line;

class Point {
    final public int x;
    final public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Line {
    final private Point start;
    final private Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public int getLength() {
        return (int) Math.sqrt(Math.pow(start.x - end.x, 2) + Math.pow(start.y - end.y, 2));
    }
}
class MyClass{
    public static void main(String[] args){
        Point a = new Point(3,1);
        Point b = new Point(3,6);
        Line lineAB = new Line(a, b);
        System.out.println(lineAB.getLength());

        Point c = new Point(1,3);
        Point d = new Point(6,15);
        Line lineCD = new Line(c, d);
        System.out.println(lineCD.getLength());
    }
}
