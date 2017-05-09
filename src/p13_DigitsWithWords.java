import java.util.Scanner;

/**
 * Created by Vilcho on 5/9/2017.
 */
public class p13_DigitsWithWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String num = scanner.nextLine().toLowerCase();

        int numDigit = 0;

        switch (num){
            case "zero":
                numDigit = 0;
                break;
            case "one":
                numDigit = 1;
                break;
            case "two":
                numDigit = 2;
                break;
            case "three":
                numDigit = 3;
                break;
            case "four":
                numDigit = 4;
                break;
            case "five":
                numDigit = 5;
                break;
            case "six":
                numDigit = 6;
                break;
            case "seven":
                numDigit = 7;
                break;
            case "eight":
                numDigit = 8;
                break;
            case "nine":
                numDigit = 9;
                break;
        }
        System.out.println(numDigit);
    }
}
