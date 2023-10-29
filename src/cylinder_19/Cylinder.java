package cylinder_19;

/**
 * 2. Write a class with the name Cylinder that extends Circle class. The class needs one field (instance variable)
 * with name height of type double.
 * The class needs to have one constructor with two parameters radius and height both of type double.
 * It needs to call the parent constructor and initialize a height field.
 * PRIME TESTING
 * In case the height parameter is less than 0 it needs to set the height field value to 0.
 * Write the following methods (instance methods):
 * ● Method named getHeight without any parameters, it needs to return the value of height field.
 * ● Method named getVolume without any parameters, it needs to return the calculated volume.
 * To calculate volume, multiply the area with height.
 */
public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius); // Call the constructor of the Circle class
        this.height = (height < 0) ? 0 : height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }

}
