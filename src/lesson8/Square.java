package lesson8;

public class Square extends Rectangle{
    public Square() {
    }

    public Square(double length, double breadth) {
        super(length, length);
    }
    public void printPerimeter(double length, double breadth){
        System.out.println("The perimeter is " + length*4);
    }
    public void printArea(double length, double breadth){
        System.out.println("The area is " + (length*length));
    }
}