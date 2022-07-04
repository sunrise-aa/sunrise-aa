package Classes_and_Objects;


import java.awt.*;

public class RectangleTest {

        public static void main(String[]args){
            Rectangle rectangle1=new Rectangle(4.0,40.0);
            Rectangle rectangle2=new Rectangle(3.5,35.9);
            System.out.println("The first rectangle's width and height is "+rectangle1.width+" and "+rectangle1.height+"  The area and perimeter is "+rectangle1.getArea()+" and " +rectangle1.getPerimeter());
            System.out.println("The second rectangle's width and height is "+rectangle2.width+" and "+rectangle2.height+" The area and perimeter is "+rectangle2.getArea()+" and " +rectangle2.getPerimeter());
        }
}
class Rectangle {
    /**
     * Default constructor
     */
    public Rectangle() {
    }

    /**
     *
     */
    public double height = 1.0;
    /**
     *
     */
    public double width = 1.0;

    /**
     *
     */
    public void Rectangle() {
        // TODO implement here
    }

    /**
     * @paramwidth
     * @paramheight
     */
    Rectangle(double newWidth, double newHeight) {
        // TODO implement here
        width = newWidth;
        height = newHeight;
    }

    /**
     * @return
     */
    public double getArea() {
        // TODO implement here
        return width * height * Math.PI;
    }

    /**
     * @return
     */
    public double getPerimeter() {
        // TODO implement here
        return 2 * (width + height);
    }

}


