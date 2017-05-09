import java.util.Scanner;

/**
 * Created by Vilcho on 5/9/2017.
 */
public class p15_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int b = Integer.parseInt(scanner.nextLine());

        int result = 0;

        switch (operator) {
            case "+":
                result = Math.addExact(a, b);
                break;
            case "-":
                result = Math.subtractExact(a, b);
                break;
            case "*":
                result = Math.multiplyExact(a, b);
                break;
            case "/":
                result = Math.floorDiv(a, b);
        }
        System.out.println(a + " " + operator + " " + b + " = " + result);

    }
}
