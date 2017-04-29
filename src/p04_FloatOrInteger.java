import java.util.Scanner;

/**
 * Created by Vilcho on 4/29/2017.
 */
public class p04_FloatOrInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());

        if (Math.floor(x) == x && Math.ceil(x) == x) {
            System.out.println((int) x);
        } else {
            System.out.println((int) (Math.round(x)));
        }

    }
}
