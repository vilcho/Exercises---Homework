import java.util.Scanner;

/**
 * Created by Vilcho on 5/9/2017.
 */
public class p14_ASCIIString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());

        String text = "";

        for (int i = 1; i <=N ; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            char letter = (char) num;
            text = text + letter;
        }
        System.out.println(text);
    }
}
