package 实现代码;

import java.util.*;

/**
 * 
 */
public class Rectangle {

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
     * @param
     */
    public void Rectangle(double newWidth, double newHeight) {
        // TODO implement here
        width=newWidth;
        height=newHeight;

    }

    /**
     * @return
     */
    public double getArea() {
        // TODO implement here
        return width*height*Math.PI;
    }

    /**
     * @return
     */
    public double getPerimeter() {
        // TODO implement here
        return 2*(width+height);
    }

}