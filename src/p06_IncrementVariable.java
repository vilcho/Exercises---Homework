import java.util.Scanner;

/**
 * Created by Vilcho on 4/30/2017.
 */
public class p06_IncrementVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int startNum = 0;
        int incrementedNum = 0;
        int max = 256;
        int overflow = 0;

        incrementedNum += num;
        boolean isIncrementedNumSmallerThan256 = incrementedNum < max;


//            if (isIncrementedNumSmallerThan256) {
//                System.out.println(incrementedNum);
//            } else {
//                overflow = incrementedNum / max;
//
//                incrementedNum = incrementedNum - overflow*max;
//
//
//                System.out.println(incrementedNum);
//
//            System.out.println("Overflowed " + overflow + " times");
//        }
        incrementedNum = num % max;
        System.out.println(incrementedNum);
        overflow = num / max;
        if (!isIncrementedNumSmallerThan256){
            System.out.println("Overflowed " + overflow + " times");
        }

    }
}
