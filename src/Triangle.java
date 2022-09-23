public class Triangle extends Shape {

    //Creates an object of typ Triangle
    public Triangle(double width,double height){
        super(width,height);
    }
    //Uses superclass shape to calculate area,
    //divides that area by two to get a triangle area.
    //returns double area
    public double getArea(){
        return super.getArea()/2;
    }
}
