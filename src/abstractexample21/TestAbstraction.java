package abstractexample21;

/**
 * Create the fourth class name TestAbstraction1 and inside create the main method as below.
 * //In real scenario, method is called by programmer or user
 */
public class TestAbstraction {
            public static void main(String[] args) {
            // Creating an instance of Circle (subclass) but using the reference of Shape (superclass)
            Shape s = new Circle();
            s.draw(); // Calls the draw method of Circle

            // You can also create an instance of Rectangle
            Shape r = new Rectangle();
            r.draw(); // Calls the draw method of Rectangle
        }
    }





