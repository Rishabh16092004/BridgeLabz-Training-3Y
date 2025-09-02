public class Circle {
    double radius;

    Circle(double radius) {
        this.radius=radius;
    }
    public void areacircle(double radius) {
        System.out.println("Area of circle : "+Math.PI*radius*radius);
    }
    public void circumference(double radius) {
        System.out.println("Circumference of circle : "+2*Math.PI*radius);
    }
    public static void main(String[] args) {
        Circle circle=new Circle(2.5);
        circle.areacircle(2.5);
        circle.circumference(2.5);
    }
}
