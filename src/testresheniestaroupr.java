import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

/**
 * Created by Vilcho on 4/23/2017.
 */
public class testresheniestaroupr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        BigDecimal exactProduct = new BigDecimal("1");

        for (int i = 1; i <= n; i++) {
            BigDecimal num1 = new BigDecimal(scanner.nextLine());
            exactProduct = exactProduct.multiply(num1);
//            String num1 = scanner.nextLine();
//            exactProduct = exactProduct.multiply(new BigDecimal(num1));
        }
        System.out.println(exactProduct);
    }
}
