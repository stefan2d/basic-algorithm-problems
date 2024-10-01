import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner (System.in);

    static int printMessage(String message){

        if (null == message) {

            System.out.println ("Choose a number...(and press Enter)");
        } else {

            System.out.println (message + "...(and press Enter)");
        }
        return scanner.nextInt ();
    }

    static int sumOfDiv(int number){

        int sum = 1;
        int aux = 2;

        while (aux < number){

            if (number % aux == 0) {

                sum += aux;

            }
            aux++;
        }
        return sum;
    }

    public static void main (String[] args) {

        int firstNumber = printMessage (" ");
        int secondNumber = printMessage (" ");

        int sumOfDivFirstN = sumOfDiv (firstNumber);
        int sumOfDivSecondN = sumOfDiv (secondNumber);

        if (sumOfDivFirstN == secondNumber && sumOfDivSecondN == firstNumber) {

            System.out.println ("(" + firstNumber + "," + secondNumber +
                    ")" + " are amicable numbers");
        } else {

            System.out.println ("(" + firstNumber + "," + secondNumber +
                    ")" + " are not  amicable numbers");
        }


    }
}