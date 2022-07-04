package 异常处理;


public class test_12_5 {
    public static void main(String[] args) {
        try {
            Triangle triangle1=new Triangle(1,2,3);
        } catch (IllegalTriangleException e) {

        }
    }

}
class Triangle{
    private double side1;
    private double side2;
    private double side3;
    public Triangle(double side1,double side2,double side3) throws IllegalTriangleException{
      if(side1+side2<=side3||side2+side3<=side1||side1+side3<=side2)
    throw new IllegalTriangleException(side1,side2,side3);
      else {
          this.side1=side1;
          this.side2=side2;
          this.side3=side3;

      }
    }

}
class IllegalTriangleException extends Exception{
    private double side1;
    private double side2;
    private double side3;
    public IllegalTriangleException(double side1,double side2,double side3 ){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
        System.out.println(side1+" "+side2+" "+side3+"不能构成三角形");
    }

}