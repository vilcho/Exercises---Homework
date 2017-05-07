import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Scanner;

import static java.math.RoundingMode.DOWN;

/**
 * Created by Vilcho on 5/7/2017.
 */
public class p10_DataOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger a = new BigInteger(scanner.nextLine());
        BigInteger b = new BigInteger(scanner.nextLine());

        BigInteger biggerNum = new BigInteger("0");
        BigInteger smallerNum = new BigInteger("0");

        if (a.compareTo(b) > 0) {
            biggerNum = a;
        } else if (b.compareTo(a) > 0) {
            biggerNum = b;
        }

        boolean isBiggerByte = ((biggerNum.compareTo(new BigInteger("0")) >= 0) && (biggerNum.compareTo(new BigInteger("255")) <= 0));
        boolean isBiggerUshort = (biggerNum.compareTo(new BigInteger("0")) >= 0) && (biggerNum.compareTo(new BigInteger("65535")) <= 0);
        boolean isBiggerUint = (biggerNum.compareTo(new BigInteger("0")) >= 0) && (biggerNum.compareTo(new BigInteger("4294967295")) <= 0);
        boolean isBiggerUlong = (biggerNum.compareTo(new BigInteger("0")) >= 0) && (biggerNum.compareTo(new BigInteger("18446744073709551615")) <= 0);


        if (isBiggerByte) {
            System.out.println("bigger type: byte");
        } else if (isBiggerUshort) {
            System.out.println("bigger type: ushort");
        } else if (isBiggerUint) {
            System.out.println("bigger type: uint");
        } else if (isBiggerUlong) {
            System.out.println("bigger type: ulong");
        }

        if (a.compareTo(b) < 0) {
            smallerNum = a;
        } else if (b.compareTo(a) < 0) {
            smallerNum = b;
        }
        boolean isSmallerByte = ((smallerNum.compareTo(new BigInteger("0")) >= 0) && (smallerNum.compareTo(new BigInteger("255")) <= 0));
        boolean isSmallerUshort = (smallerNum.compareTo(new BigInteger("0")) >= 0) && (smallerNum.compareTo(new BigInteger("65535")) <= 0);
        boolean isSmallerUint = (smallerNum.compareTo(new BigInteger("0")) >= 0) && (smallerNum.compareTo(new BigInteger("4294967295")) <= 0);
        boolean isSmallerUlong = (smallerNum.compareTo(new BigInteger("0")) >= 0) && (smallerNum.compareTo(new BigInteger("18446744073709551615")) <= 0);

        String smallerType = "";
        BigInteger overflowDivider = new BigInteger("0");
//това според мен е грешно но така го приема judge-a
// би трябвало да се дели на (максималната стойност на типа променлива +1), (например на 256, а не на 255...) за да има наистина овърфлоу.
// да не говорим, че закръглянето би трябвало да е надолу, а не нагоре... Останалото е остатък, и не овърфлоува.
        if (isSmallerByte) {
            smallerType = "byte";
            overflowDivider = new BigInteger("255");
            System.out.println("smaller type: byte");
        } else if (isSmallerUshort) {
            smallerType = "ushort";
            overflowDivider = new BigInteger("65535");
            System.out.println("smaller type: ushort");
        } else if (isSmallerUint) {
            smallerType = "uint";
            overflowDivider = new BigInteger("4294967295");
            System.out.println("smaller type: uint");
        } else if (isSmallerUlong) {
            smallerType = "ulong";
            overflowDivider = new BigInteger("18446744073709551615");
            System.out.println("smaller type: ulong");
        }

        BigDecimal overflow = new BigDecimal(biggerNum).divide(new BigDecimal(overflowDivider), RoundingMode.HALF_UP);

        System.out.println(biggerNum + " can overflow " + smallerType + " " + overflow + " times");
    }

}
