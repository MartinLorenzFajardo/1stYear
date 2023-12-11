// Martin Lorenz S. Fajardo
// BIT112L OBcL
// November 18, 2023

// Write a method called sum100 that returns the sum of the integers from 1 to 100.


public class OBcL_Fajardo_Martin_Sum100 {

    // sum100
    public static int sum100( ) {
        int sum = 0;

	    for (int i = 1; i <= 100; i++) {
	    	sum += i;
	    }
	    return sum;
    }
    
    // runner
    public static void main(String[] args) {
        System.out.println("The sum of the integers from 1 to 100 is: " + sum100());
    }
}