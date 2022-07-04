package Classes_and_Objects;

public class Fan {

        public Fan() {
        }
        public final int SLOW = 1;
        public final int MEDIUM = 2;
        public int FAST = 3;
        private int speed = SLOW;
        private boolean on = false;
        private double radius = 5;
        public String color = "blue";
        public void setSpeed(int speed) {
            this.speed=speed;
        }
        public int getSpeed() {
            return this.speed;
        }
        public void setOn(boolean on) {
            this.on=on;
        }
        public boolean getOn() {
            return this.on;
        }
        public void setColor(String color) {
            this.color=color;
        }
        public String getColor() {
            // TODO implement here
            return ""+this.color;
        }
        public void setRadius( double radius){
            this.radius=radius;
        }
        public double getRadius(){
            return this.radius;
        }
        public void Fan() {
        }
        public String toString() {
            if(on==true)
              return "The speed,color,radius is "+this.getSpeed()+" ,"+this.getColor()+" and"+ this.getRadius();
            else
                return "fan is off "+"and the  fan's color,radius is "+this.getColor()+" and "+ this.getRadius();
        }

}

