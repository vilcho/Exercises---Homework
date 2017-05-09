import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * Created by Vilcho on 5/5/2017.
 */
public class p08_TravellingAtLightSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal lightYears = BigDecimal.valueOf(Double.parseDouble(scanner.nextLine()));

        BigDecimal lyToKm = new BigDecimal("9450000000000");
        BigDecimal speedLightKmPerSec = new BigDecimal("300000");

        BigDecimal seconds = ((lightYears.multiply(lyToKm)).divide(speedLightKmPerSec, RoundingMode.HALF_UP));
        BigDecimal minutes = (seconds.divide(new BigDecimal("60"), RoundingMode.HALF_UP));
        seconds = (seconds.remainder(new BigDecimal("60"))).setScale(0, BigDecimal.ROUND_DOWN);
        BigDecimal hours = (minutes.divide(new BigDecimal("60"), RoundingMode.HALF_UP));
        minutes = (minutes.remainder(new BigDecimal("60"))).setScale(0, BigDecimal.ROUND_DOWN);
        BigDecimal days = (hours.divide(new BigDecimal("24"), RoundingMode.HALF_UP));
        hours = (hours.remainder(new BigDecimal("24"))).setScale(0, BigDecimal.ROUND_DOWN);
        BigDecimal weeks = (days.divide (new BigDecimal("7"), RoundingMode.HALF_UP)).setScale(0, BigDecimal.ROUND_DOWN);
        days = (days.remainder(new BigDecimal("7"))).setScale(0, BigDecimal.ROUND_DOWN);


        System.out.println(weeks + " weeks");
        System.out.println(days + " days");
        System.out.println(hours + " hours");
        System.out.println(minutes + " minutes");
        System.out.println(seconds + " seconds");



//        BigDecimal secondsInAWeek = new BigDecimal("604800.0");
//        BigDecimal secondsInDay = new BigDecimal("86400");
//        BigDecimal secondsInHour = new BigDecimal("3600");
//        BigDecimal secondsInMin = new BigDecimal("60");
//
//        BigDecimal totalSeconds = (lightYears.multiply(lyToKm)).divide(speedLightKmPerSec, RoundingMode.HALF_UP);
//
//        BigDecimal weeks = totalSeconds.divide(secondsInAWeek, RoundingMode.HALF_UP);
//        BigDecimal days = (totalSeconds.remainder(secondsInAWeek)).divide(secondsInDay, RoundingMode.HALF_UP);
//
//        BigDecimal weeksTruc = weeks.setScale(0, BigDecimal.ROUND_DOWN);
//        BigDecimal daysTrunc = days.setScale(0, BigDecimal.ROUND_DOWN);
//
//        BigDecimal secondsLeftAfterDays = totalSeconds.subtract(weeksTruc.multiply(secondsInAWeek)).subtract(daysTrunc.multiply(secondsInDay));
//        BigDecimal hours = secondsLeftAfterDays.divide(secondsInHour, RoundingMode.HALF_UP);
//        BigDecimal hoursTrunc = hours.setScale(0, BigDecimal.ROUND_DOWN);
//
//        BigDecimal minutes = (secondsLeftAfterDays.remainder(secondsInHour)).divide(secondsInMin, RoundingMode.HALF_UP);
//        BigDecimal minutesTrunc = minutes.setScale(0, BigDecimal.ROUND_DOWN);
//
//        BigDecimal seconds = secondsLeftAfterDays.subtract((hoursTrunc.multiply(secondsInHour)).add(minutesTrunc.multiply(secondsInMin)));
//        BigDecimal secondsTrunc = seconds.setScale(0,BigDecimal.ROUND_DOWN);
//
////        System.out.printf("%.0f weeks%n", weeks);
////        System.out.printf("%.0f days%n", days);
////        System.out.printf("%.0f hours%n", hours);
////        System.out.printf("%.0f minutes%n", minutes);
////        System.out.printf("%.0f seconds", seconds);
//        System.out.println(weeksTruc + " weeks");
//        System.out.println(daysTrunc + " days");
//        System.out.println(hoursTrunc + " hours");
//        System.out.println(minutesTrunc + " minutes");
//        System.out.println(secondsTrunc + " seconds");



       // Km = km/h *h;



    }
}
