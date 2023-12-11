// Martin Lorenz S. Fajardo
// BIT112L OBcL
// November 29, 2023

import java.util.Scanner;

public class OBcL_Fajardo_tempConverter {

  public static void main(String[] args) {

    int unit;
    double c = 0.0;
    double f = 0.0;

    System.out.println("=====TEMPERATURE CONVERTER=====\n");

    Scanner scanner = new Scanner(System.in);
      System.out.println("Enter temperature to convert (1 = c to f / 2 = f to c)");
      unit = scanner.nextInt();  

      if (unit == 1) {
        System.out.print("-------------------------\n");
        System.out.println("Enter the temperature in Celsius: ");
        c = scanner.nextDouble(); 
      }
      else if (unit == 2) {
        System.out.print("-------------------------\n");
        System.out.println("Enter the temperature in Fahrenheit: ");
        f = scanner.nextDouble(); 
      }
    
    scanner.close();

    // computation for celsius to fahrenheit
    double fahrenheit = ((9*c)/5)+32;

    // computation for fahrenheit to celsius
    double celsius = (f-32)*5/9;

    // output
    switch (unit) {
      case 1:
        System.out.print("-------------------------\n");
        System.out.println("That is " + fahrenheit + " in farenheit");
      break;
      case 2:
        System.out.print("-------------------------\n");
        System.out.println("That is " + celsius + " in celsius");
      break;
    }

  }

}
