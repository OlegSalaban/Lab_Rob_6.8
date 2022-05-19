public class Line {
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Line() {
    }

    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    void print() {
        System.out.println("Class Line. Object: lineObj");
        System.out.println("X1 = " + x1);
        System.out.println("Y1 = " + y1);
        System.out.println("X2 = " + x2);
        System.out.println("Y2 = " + y2);
    }

    double length() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    double length(Point p) {
        return Math.sqrt(Math.pow(x2 - p.getX(), 2) + Math.pow(y2 - p.getY(), 2));
    }
}
