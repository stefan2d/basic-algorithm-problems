import java.util.Scanner;

public class Main {


    private static Scanner scanner = new Scanner (System.in);

    static int readNumber(){

        return scanner.nextInt ();
    }

    static void findClosestMultiple(int number){

        int dif = 0;

        if (number % 5 == 0){

            System.out.println (number);
        } else {

            dif = number % 5;
            System.out.println (number - dif);
        }


    }
    public static void main (String[] args) {

        int number = readNumber ();

        findClosestMultiple (number);
    }
}
