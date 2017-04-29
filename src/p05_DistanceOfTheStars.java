import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * Created by Vilcho on 4/29/2017.
 */
public class p05_DistanceOfTheStars {
    public static void main(String[] args) {
        BigDecimal proximaDistance = new BigDecimal("4.22");
        BigDecimal milkyWayDistance = new BigDecimal("26000");
        BigDecimal milkyWayDiameter = new BigDecimal("100000");
        BigDecimal edgeOfUniverse = new BigDecimal("46500000000");

        BigDecimal lyToKm = new BigDecimal("9450000000000");

        DecimalFormat df = new DecimalFormat("0.00E000");


        BigDecimal proximaKm = proximaDistance.multiply(lyToKm);
        double proximaKmToDouble = proximaKm.doubleValue();
        String proximaKmDToString = String.valueOf(df.format(proximaKmToDouble).toLowerCase());
        if (!proximaKmDToString.contains("e-")) {
            proximaKmDToString = proximaKmDToString.replace("e", "e+");
        }
        System.out.println(proximaKmDToString);


        BigDecimal milkyWayKm = milkyWayDistance.multiply(lyToKm);
        double milkyWayKmToDouble = milkyWayKm.doubleValue();
        String milkyWayKmDToString = String.valueOf(df.format(milkyWayKmToDouble).toLowerCase());
        if (!milkyWayKmDToString.contains("e-")) {
            milkyWayKmDToString = milkyWayKmDToString.replace("e", "e+");
        }
        System.out.println(milkyWayKmDToString);

        BigDecimal milkyWayDiameterKm = milkyWayDiameter.multiply(lyToKm);
        double milkyWayDiameterKmToDouble = milkyWayDiameterKm.doubleValue();
        String milkyWayDiameterDToString = String.valueOf(df.format(milkyWayDiameterKmToDouble).toLowerCase());
        if (!milkyWayDiameterDToString.contains("e-")){
            milkyWayDiameterDToString = milkyWayDiameterDToString.replace("e", "e+");
        }
        System.out.println(milkyWayDiameterDToString);

        BigDecimal edgeUniverseKm = edgeOfUniverse.multiply(lyToKm);
        double edgeUniverseKmToDouble = edgeUniverseKm.doubleValue();
        String edgeUniverseKmDToString = String.valueOf(df.format(edgeUniverseKmToDouble).toLowerCase());
        if (!edgeUniverseKmDToString.contains("e-")){
            edgeUniverseKmDToString = edgeUniverseKmDToString.replace("e", "e+");
        }
        System.out.println(edgeUniverseKmDToString);
    }
}
