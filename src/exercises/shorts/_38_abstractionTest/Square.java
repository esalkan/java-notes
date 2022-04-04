package exercises.shorts._38_abstractionTest;

public class Square extends Shape {

    // Square Class instances
    public double side;

    // Shape class is super/parent ABSTRACT class
    // Square class is here CONSTRUCTOR class

    // Need to OVERRIDE Super/Parent ABSTRACT Class Method
    @Override
    public double area() {
        return side * side;
    }
}
