import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        boolean bool = true;

        while (bool){
            //options menu
            System.out.println();
            System.out.println("Add");
            System.out.println("Subtract");
            System.out.println("Multiply");
            System.out.println("Divide");
            System.out.println("Exit");
            String m = menu();

            if (m.equals("Exit")) {
                System.out.println();
                System.out.println("Goodbye!");
                bool = false;
            }
            else {
                // double nums = getString("Enter each number seperated by a space");
                // double[] numList = nums.split(" ");

                double num1 = getDouble("Enter the first number ");
                double num2 = getDouble("Enter the second number ");
                System.out.println();
                System.out.println(String.format("Your numbers are %g and %g", num1, num2));
                
                if (m.equals("Add")) {
                    System.out.println( "Addition RESULT : " + calc.add(num1, num2));
                }
                else if (m.equals("Subtract")){
                    System.out.println( "Subtraction RESULT : " + calc.subtract(num1, num2));
                }
                else if (m.equals("Multiply")) {
                    System.out.println( "Multiplication RESULT : " + calc.multiply(num1, num2));
                }
                else if (m.equals("Divide")) {
                    if (num2 == 0){
                        System.out.println("*******************************");
                        System.out.println("ERROR! You cannot divide by 0");
                        System.out.println("Please try again");
                        System.out.println("*******************************");
                    }
                    else {
                        System.out.println( "Division RESULT : " + calc.divide(num1, num2));
                    }
                }
            }
        }
    }

    static Calculator calc = new Calculator();

    private static final Scanner inputScanner = new Scanner(System.in);
  
    private static String getString(String prompt) {
        System.out.println(prompt);
        String result = inputScanner.next();
        return result;
    }

    private static double getDouble(String prompt) {
        System.out.println(prompt);
        return inputScanner.nextDouble();
    }

    private static String menu() {
        String options = getString("What operation above would you like to perform? ");

        String result = "";
        if (options.equals("Add") || options.equals("add")) {
            result = "Add";
        }
        else if (options.equals("Subtract") || options.equals("subtract")) {
            result = "Subtract";
        }
        else if (options.equals("Multiply") || options.equals("multiply")) {
            result = "Multiply";
        }
        else if (options.equals("Divide") || options.equals("divide")) {
            result = "Divide";
        }
        else if (options.equals("Exit") || options.equals("exit")) {
            result = "Exit";
        }

        return result;
    }
}