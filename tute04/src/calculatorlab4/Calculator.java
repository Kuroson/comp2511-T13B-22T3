package calculatorlab4;

public class Calculator {

    public static Double add(Double a, Double b) {
        return a + b;
    }

    public static Double subtract(Double a, Double b) {
        return a - b;
    }

    /* 
     * precondition: a & B can't be null 
     */
    public static Double multiply(Double a, Double b) {
        return a * b;
    }

    /*
     * precondition: either a or b can't be null
     * b can't be zero
     */
    public static Double divide(Double a, Double b) {
        return a / b;
    }

    public static Double sin(Double angle) {
        return Math.sin(angle);
    }

    public static Double cos(Double angle) {
        return Math.cos(angle);
    }

    public static Double tan(Double angle) {
        return Math.tan(angle);
    }

}