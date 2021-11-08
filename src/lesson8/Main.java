package lesson8;

public class Main {
    public static void main(String[] args) {
        ParentClass parentClass = new ParentClass();
        parentClass.printParent();

        ChildClass childClass = new ChildClass();
        childClass.printChild();

        childClass.printParent();


        // We can not use private method without another methos or constructor
        //    parentClass.printSmthPrivate();
        //    childClass.printSmthPrivate();

        Employee employee = new Employee("John", 30, "25451515", "Purvciema", 25455.25);
        Manager manager = new Manager("Zanna", 10, "25254411", "Stirnu", 682211.33);

        employee.printSalary();
        manager.printSalary();

        Rectangle rectangle = new Rectangle(2,3);
        Square square = new Square(4,4);


        rectangle.printArea();
        rectangle.printPerimeter();
        square.printArea();
        square.printPerimeter();
    } }