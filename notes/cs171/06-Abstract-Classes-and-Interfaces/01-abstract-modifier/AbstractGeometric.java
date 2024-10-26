public abstract class AbstractGeometric { // An abstract class is a class that cannot be instantiated
    private String color;
    AbstractGeometric( ) { }          // Constructor 1

    AbstractGeometric(String col) {  // Constructor 2
        color = col;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String c)  {
        color = c;
    }

    // Abstract Methods: Only the method declaration without the method body
    //  - for polymorphism;
    //  - must be in an abstract class (a normal class cannot have abstract methods)
    public abstract double getArea();
}
