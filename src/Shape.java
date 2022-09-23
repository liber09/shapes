public class Shape {
    private double width;
    private double height;

    // create a instance of the obeject.
    public Shape(double width, double height) {
        this.width = width;
        this.height = height;
    }
    // returns the width of the shape.
    public double getWidth(){
        return this.width;
    }
    // reurns the height of the shape.
    public double getHeight(){
        return this.height;
    }
    public double getArea(){
         double result = width * height;
        return result;
    }
}
