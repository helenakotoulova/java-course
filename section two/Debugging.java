public class Debugging {

    public static void main(String[] args) {

        /************** Debugging **************/

        int exam1Score = 85;
        int exam2Score = 90;
        int exam3Score = 95;

        int total = 100;

        double decimalScore1 = exam1Score / (double)total;
         System.out.println(decimalScore1);
        double decimalScore2 = exam2Score / (double) total; 
        double decimalScore3 = exam3Score / (double) total; 

        double decimalAverage = (decimalScore1 + decimalScore2 + decimalScore3) / 3.0;

        System.out.println("The decimal average is: " + decimalAverage);

    }
}
