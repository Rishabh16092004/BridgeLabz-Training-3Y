class  circle{
    double radius;

    circle(double radius){
        this.radius=radius;
    }

    void display(){
        System.out.println("radius: "+radius);
    }

    public static void main(String args[]){
        circle c=new circle(2.5);
        c.display();
    }
}
