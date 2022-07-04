package 接口;



public class GeometricObject implements Comparable<GeometricObject>{
  public double area;
  public double getArea(){
   return area;
  }
 public int compareTo(GeometricObject o) {
  if(getArea()>o.getArea())
   return -1;
  else if(getArea()==o.getArea())
   return 0;
  else
   return 1;
 }
    public GeometricObject(){

    }
    public static void max(GeometricObject geometricObject1,GeometricObject geometricObject2){
     if(geometricObject1.compareTo(geometricObject2)<0)
      System.out.println(" The max is the first geometric");
     else if(geometricObject1.compareTo(geometricObject2)==0)
      System.out.println("They are the same");
     else
      System.out.println("The max is the second geometric");
    }

}
class Rectangle extends GeometricObject{

  public double width;
  public double height;

 public Rectangle() {
 }

 public Rectangle(double width, double height) {
  this.width = width;
  this.height = height;
 }
 public double getArea(){
  return width*height;
 }
}
 class Circle extends GeometricObject{
  public double radius;

 public Circle() {
 }

 public Circle(double radius) {
  this.radius = radius;
 }

    @Override
    public double getArea() {
        return 3.14*radius*radius;
    }
}
class geometricObjectTest{
    public static void main(String[] args) {
        GeometricObject circle1=new Circle(2);
        GeometricObject circle2=new Circle(3.0);
        GeometricObject rectangle1=new Rectangle(2,3);
        GeometricObject rectangle2=new Rectangle(3,5);
        circle1.max(circle1,circle2);
        rectangle1.max(rectangle1,rectangle2);
    }

}