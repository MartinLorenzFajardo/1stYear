// Martin Lorenz S. Fajardo
// BIT112L OBcL
// November 20, 2023

// Write a method called maxOfTwo that accepts two integer parameters and returns the larger of the two


public class OBcL_Fajardo_Martin_maxOfTwo {

    // maxOfTwo
    public static int maxOfTwo(int num1, int num2) {
        int result = num1;

        if (num2 > num1) {
            result = num2;
        }
        return result;
    }

    // runner
    public static void main(String[] args) {
        // just example values (pre-defined):
        int num1 = 10;
        int num2 = 5;

        System.out.println("The larger between the two is " + maxOfTwo(num1, num2));
    }
}