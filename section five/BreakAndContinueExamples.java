public class BreakAndContinueExamples {

    public static void main(String[] args) {
        System.out.println("First task");
        // 01234
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.print(i);
        }

        System.out.println("");
        System.out.println("Second task");
        // 012346789
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.print(i);
        }

        System.out.println("");
        System.out.println("Third task");
        for (int i = 1; i < 20; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
                break;
            }
        }

    }
}
