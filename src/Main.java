public class Main {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(200,100);
        Shape s2 = new Rectangle(50,25);
        Shape s3 = new Triangle(95,85);
        Shape s4 = new Triangle(558,45);

        System.out.println("Rectangle 1 has area: "+ s1.getArea());
        System.out.println("Rectangle 2 has area: "+s2.getArea());
        System.out.println("Rectangle 1: width: "+s1.getWidth()+" height: "+s1.getHeight());
        System.out.println("Rectangle 2: width: "+s2.getWidth()+" height: "+s2.getHeight());

        System.out.println("Triangle 1: width: "+s3.getWidth()+" height: "+s3.getHeight());
        System.out.println("Triangle 2: width: "+s4.getWidth()+" height: "+s4.getHeight());
        System.out.println("Triangle 1 has area: "+s3.getArea());
        System.out.println("Triangle 2 has area: "+s4.getArea());


    }
}