import java.math.BigDecimal;

public class Decimals {
    public static void main(String[] args) {

        double x = 0.1;
        System.out.println(x); // 0.1
        double y = 0.2;
        double z = x + y;
        System.out.println(z); //  0.30000000000000004

        BigDecimal xx = new BigDecimal("0.1");
        System.out.println(xx);// 0.1
        BigDecimal yy = new BigDecimal("0.2");
        System.out.println(xx.add(yy)); // 0.3
    }

}