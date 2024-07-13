package csMiddle.object.point;

class Point {
    final public int x;
    final public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class MyClass{
    public static void main(String[] args){
        Point a = new Point(3,1);
        Point b = new Point(3,6);

        System.out.println(a.x);
        System.out.println(a.y);
        System.out.println(b.x);
        System.out.println(b.y);
    }
}
