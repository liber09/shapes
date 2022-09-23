public class Triangle extends Shape {

    public Triangle(double width,double height){
        super(width,height);
    }
    public double getArea(){
        return super.getArea()/2;
    }
}
