
interface Comparable<E>{
    public int compareTo(E o);
}
class Rectangle  {

    public double width;
    public double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
}

class Circle {
    public double radius;

    public Circle() {
    }

    public Circle(double radius) {

        this.radius = radius;
    }

    public double getArea() {

        return 3.14 * radius * radius;
    }
}
    class ComparableCicleTest {
        public static void main(String[] args) {
            ComparableCircle circle1 = new ComparableCircle(2.44);
            ComparableCircle circle2 = new ComparableCircle(3.44);
            ComparableCircle circle3 = new ComparableCircle(2.55);
            Rectangle rectangle1 = new Rectangle(5, 6);
            if (circle1.compareTo(circle2) < 0)
                System.out.println("The bigger is the circle1");
            else if (circle1.compareTo(circle2) == 0)
                System.out.println("The are the same area");
            else
                System.out.println("the bigger is the circle2");
            if (circle3.getArea() > rectangle1.getArea())
                System.out.println("The bigger is the circle");
            else if (circle3.getArea() > rectangle1.getArea())
                System.out.println("The are the same area");
            else
                System.out.println("the bigger is the rectangle1");
        }
    public static class ComparableCircle extends Circle implements Comparable<ComparableCircle> {


        public int compareTo(ComparableCircle o) {
            if (getArea() > o.getArea())
                return -1;
            else if (getArea() == o.getArea())
                return 0;
            else
                return 1;
        }

        public ComparableCircle(double radius) {
            this.radius=radius;
        }
    }
}
