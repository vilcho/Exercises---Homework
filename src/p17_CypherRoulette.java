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
        int spinCount = 0;

        for (int i = 1; i <= N; i++) {
            String text = scanner.nextLine();

            if (previousText.equals(text)) {
                cypherString = "";
                //spinCount = 0;
                //previousText = "";

                if (text.equals("spin")) {
                    N = N + 1;
                    continue;
                }
            } else if (text.equals("spin")) {
                N += 1;
                spinCount++;
            } else if (!Objects.equals(text, "spin") && !(previousText.equals(text))) {
                if (spinCount % 2 == 0) {
                    cypherString = cypherString.concat(text);
                } else {
                    cypherString = text.concat(cypherString);
                }
            }
            //}
            previousText = text;
        }
        System.out.println(cypherString);
    }
}

