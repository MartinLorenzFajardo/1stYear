// LGTV: Fajardo, Manrique, Macasinag, Disuanco
// BIT112L OBcL
// DECEMBER 09 2023 - Modified DECEMBER 11 2023

import java.util.Scanner;

public class LGTV_JavaCal {
    
    public static void main(String[] args) {
        System.out.println("JAVA CALCULATOR");
        System.out.println("======================");
        
        while (true) {
            System.out.println("");
            float operand1 = getInput("First number");
            float operand2 = getInput("Second number");
            String operator;
    
            do {
                operator = getOperator();
                if (!checkValidity(operator)) {
                    System.out.println("INVALID! That's not a valid operation!");
                }
            } while (!checkValidity(operator));
    
            performOperation(operand1, operand2, operator);
    
            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String response = new Scanner(System.in).next().toLowerCase();
            if (response.equals("yes") || response.equals("y")) {
                System.out.println("");
            }    
            if (response.equals("no") || response.equals("n")) {
                System.out.println("Thank you for using our program!");
                break;
            }
        }
    }
    
    // OPERATOR
    public static String getOperator() {
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("OPERATIONS:");
        System.out.println("-----------------");
		System.out.println("Addition: +");
		System.out.println("Subtraction: -");
		System.out.println("Multiplication: *");
		System.out.println("Division: /");
		System.out.println("");
		System.out.print("Select your Desired Operation: ");
        return input.next();
    }
    
    // INPUT
    public static float getInput(String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.print(prompt + ": ");
        while (true) {
            if (input.hasNextFloat()) {
                return input.nextFloat();
            } else {
                System.out.println("INVALID!");
                System.out.println("");
                System.out.print("Please enter a valid number: ");
                input.next();
            }
        }
    }
    
    // VALIDITY
    public static boolean checkValidity(String operator) {
        switch (operator.toLowerCase()) {
            case "+":
            case "-":
            case "*":
            case "/":
                return true;
            default:
                return false;
        }
    }

    public static void performOperation(float operand1, float operand2, String operator) {
        switch (operator) {
            case "+":
                viewOutput(operand1, operand2, operator, addition(operand1, operand2));
                break;
            case "-":
                viewOutput(operand1, operand2, operator, subtraction(operand1, operand2));
                break;
            case "*":
                viewOutput(operand1, operand2, operator, multiplication(operand1, operand2));
                break;
            case "/":
                viewOutput(operand1, operand2, operator, division(operand1, operand2));
                break;
            default:
                System.out.println("Error! Invalid operator.");
        }
    }    

    // OUTPUT
    public static void viewOutput(float operand1, float operand2, String operator, float result) {
        System.out.println(operand1 + " " + getOperatorSymbol(operator) + " " + operand2 + " = " + result);
    }    

    public static String getOperatorSymbol(String operator) {
        return operator;
    }     

    // ADDITION
    public static float addition(float x, float y) {
        return x + y;
    }

    // SUBTRACTION
    public static float subtraction(float x, float y) {
        return x - y;
    }

    // MULTIPLICATION
    public static float multiplication(float x, float y) {
        return x * y;
    }

    // DIVISION
    public static float division(float x, float y) {
        if (y != 0) {
            return x / y;
        } else {
            System.out.println("Error! Division by zero.");
            return 0;
        }
    }
}