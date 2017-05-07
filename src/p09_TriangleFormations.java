import java.util.Scanner;

/**
 * Created by Vilcho on 5/7/2017.
 */
public class p09_TriangleFormations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        if (!(a + b > c && a + c > b && b + c > a)) {
            System.out.println("Invalid Triangle.");
        } else {
            System.out.println("Triangle is valid.");
            if (a * a + b * b == c * c) {
                System.out.println("Triangle has a right angle between sides a and b");
            } else if (a * a + c * c == b * b) {
                System.out.println("Triangle has a right angle between sides a and c");
            } else if (b * b + c * c == a * a) {
                System.out.println("Triangle has a right angle between sides b and c");
            } else {
                System.out.println("Triangle has no right angles");
            }
        }
    }
}
