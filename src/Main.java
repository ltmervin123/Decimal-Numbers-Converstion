import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        //Input validation
        try{
            //Prompt the user to input an integer value
            System.out.print("Input decimal number : ");
            var number = scanner.nextInt();
            displayResult(number);
        }catch (Exception e){
            //Display invalid input if exception occur
            System.out.println("Invalid Input");
        }
    }

    //A function that display the result
    private static void displayResult(int number) {
        System.out.println("****** Result ******");
        System.out.println(" Hexadecimal | " + toHexaDecimal(number));
        System.out.println(" Binary      | " + toBinary(number));
        System.out.println(" Octal       | " + toOctal(number));
    }

    //A function that convert decimal numbers to octal numbers
    private static String toOctal(int number) {
        var result = "";
       final var octalBase = 8;
       while (number > 0){
           result = result.concat(String.valueOf(number % octalBase));
           number /= octalBase;
       }
        return reverseResult(result);
    }

    //A function that convert decimal numbers to binary numbers
    private static String toBinary(int number) {
        var result = "";
        final var binaryBase = 2;
        while (number > 0){
            result = result.concat(String.valueOf(number % binaryBase));
            number /= binaryBase;
        }
        return reverseResult(result);
    }

    //A function that convert decimal numbers to Hexadecimal numbers
    private static String toHexaDecimal(int number) {
        var result = "";
        final String[] hexaCharacters = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        final var hexaBase = 16;
        while (number > 0){
            result = result.concat(String.valueOf(hexaCharacters[number % hexaBase]));
            number /= hexaBase;
        }
        return reverseResult(result);
    }

    //A function that reverse a string
    private static String reverseResult(String result) {
        var reverseResult = "";
        for(int i = (result.length() - 1); i >= 0; i--){
            char c = result.charAt(i);
            reverseResult = reverseResult.concat(String.valueOf(c));
        }
        return reverseResult;
    }
}