package programme_17_carpet_cost_calculator;

/**
 * 1. Write a class with the name Floor. The class needs two fields (instance variables)
 * with name width and length of type double.
 * The class needs to have one constructor with parameters width and length of type double and it needs to initialize the fields.
 * In case the width parameter is less than 0 it needs to set the width field value to 0,
 * in case the length parameter is less than 0 it needs to set the length field value to 0.
 * Write the following methods (instance methods):
 * PRIME TESTING
 * ● Method named getArea without any parameters, it needs to return the calculated area (width * length).
 */
public class Floor {
    private double width;
    private double length;

    public Floor(double width, double length) {
        this.width = (width < 0) ? 0 : width;
        this.length = (length < 0) ? 0 : length;
    }

    public double getArea() {
        return width * length;
    }

}
