import java.util.Scanner;

/**
 * Created by Vilcho on 4/29/2017.
 */
public class p03_ExchangeVariableValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());;
        int b = Integer.parseInt(scanner.nextLine());;

//        System.out.println(a);
//        System.out.println(b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);


    }
}
