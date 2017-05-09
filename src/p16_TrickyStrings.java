import java.util.Scanner;

/**
 * Created by Vilcho on 5/9/2017.
 */
public class p16_TrickyStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String delimiter = scanner.nextLine();

        int N = Integer.parseInt(scanner.nextLine());

        String result = "";

        for (int i = 1; i <= N-1 ; i++) {
            String text = scanner.nextLine();
            result += text + delimiter;
        }
        String lastText = scanner.nextLine();
        System.out.println(result + lastText);
    }
}
