import 接口.GeometricObject;



class SquareTest{
    public static void main(String[] args){
        Object[] objects={new Rectangle(),new Circle(),new Square(),new GeometricObject(),new GeometricObject()};
    for(int i=0;i<5;i++){
        if(objects[i] instanceof Square)
                 ((Square) objects[i]).howToColor();
            else
            System.out.println("这个图形不可着色");

    }
    }
    }


public class Square extends GeometricObject implements Colorable{
    public void howToColor(){
        System.out.println("给所有的四条边着色");
    }
    private double side;

    public Square(double side) {

        this.side = side;
    }

    public Square() {
    }

    public double getSide() {

        return side;
    }

    public void setSide(double side) {

        this.side = side;
    }
}
interface Colorable{
    void howToColor();
}