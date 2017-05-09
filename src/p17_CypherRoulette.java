import java.util.Objects;
import java.util.Scanner;

/**
 * Created by Vilcho on 5/10/2017.
 */
public class p17_CypherRoulette {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());

        String cypherString = "";
        String previousText = "";

        for (int i = 1; i <= N; i++) {
            String text = scanner.nextLine();
            if (!Objects.equals(text, "spin") && !(previousText.equals(text)) && !(previousText.equals("spin"))) {
                cypherString = cypherString.concat(text);
            }
            if (text.equals("spin")) {
                N = N + 1;
            }
            if (previousText.equals("spin")) {
                cypherString = text.concat(cypherString);
            }
            if (previousText.equals(text)) {
                cypherString = "";
            }
            previousText = text;
        }
        System.out.println(cypherString);
    }
}

