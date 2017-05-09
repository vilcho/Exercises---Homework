import java.util.Scanner;

/**
 * Created by Vilcho on 5/9/2017.
 */
public class p12_VariablesInHexadecimalFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String hexNum = scanner.nextLine();

        int decimalNum = Integer.decode(hexNum);
        //долното не работи, по-долу е обяснено защо
        //int decimalNum = Integer.parseInt("0x37", 16);

//        int value = Integer.valueOf("00ff0000", 16);
//        Note that Integer.valueOf(string,16); does not accept a prefix of 0x.
//         If your string contains the 0x prefix, you can use Integer.decode("0x00ff0000");

//        Integer.parseInt("00ff00", 16)
//        16 means that you should interpret the string as 16-based (hexadecimal). By using 2 you can parse binary number, 8 stands for octal. 10 is default and parses decimal numbers.
//        In your case Integer.parseInt(primary.getFullHex(), 16) won't work due to 0x prefix prepended by getFullHex() - get rid of and you'll be fine.

        System.out.println(decimalNum);
    }
}
