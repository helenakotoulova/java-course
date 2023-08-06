public class Parameters {

    static String globalVariable = "I am global variable"; 
    public static void main(String[] args) {
        calculateAreaAndPrinted(2.5, 5);
        double area = calculateAreaAndReturnIt(1, 3);
        System.out.println(area);
        String explanation = explainArea("Czech");
        System.out.println(explanation);

        calculateAreaAndReturnIt(-2, 1);

        // System.out.println(localVariable); // outside of the scope
    }

    public static void calculateAreaAndPrinted(double width, double height) {
        double area = width * height;
        System.out.println(area);
        System.out.println(globalVariable);
        String localVariable = "I am local variable";
    }
    
    /// zmacknu /** a enter a udela se mi zakladni kostra pro DOC COMMENT
    /**
     * Function name calculateAreaAnrReturnIt
     * @param width (double)
     * @param height (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. check validity of the parameters
     * 2. calculate area and return it
     */
    public static double calculateAreaAndReturnIt(double width, double height) {
        if (width < 0 || height < 0) {
            System.out.println("Invalid parameters.");
            System.exit(0);
        }
        double area = width * height;
        return area;
    }

    public static String explainArea(String language) {
        switch (language) {
            case "English":
                return "Area is ...";
            case "Czech":
                return "Plocha je ...";
            default:
                return "Area is ...";
        }
    }
}
