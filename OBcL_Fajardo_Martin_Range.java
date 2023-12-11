// Martin Lorenz S. Fajardo
// BIT112L OBcL
// November 19, 2023

// Write a method called sumRange that accepts two integer parameters that represent a range. You may assume the first parameter
// is less than or equal to the second. The method should return the sum of the integers in that range


public class OBcL_Fajardo_Martin_Range {

    // sumRange
 	public static int sumRange (int low, int high) {
        if (low > high) {
            throw new IllegalArgumentException("Invalid range");
        }

        int sum = 0;

        for (int i = low; i <= high; i++) {
            sum += i;
        }
        return sum;
	}

    // runner
    public static void main(String[] args) {
        // just eample values (pre-defined):
        int low = 1;
        int high = 5;
        int result = sumRange(low, high);

        System.out.println("Sum of the range from " + low + " to " + high + " is: " + result);
    }
}