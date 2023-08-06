import java.util.Arrays;

public class IntroToArrays {
    public static void main(String[] args) {
        String[] kingdoms = { "k1", "k2", "k3" };
        System.out.println(kingdoms); // [Ljava.lang.String;@7a81197d   - jde o hash pointujici na misto v pameti, kde je ten array ulozen
        System.out.println(kingdoms[0]); // k1

        System.out.println(kingdoms.length);

        for (int i = 0; i < kingdoms.length; i++) {
            System.out.println(kingdoms[i]);
        }

        for (String str : kingdoms) {
            System.out.println(str);
        }

        String searchEl = "k3";

        for (int i = 0; i < kingdoms.length; i++) {
            if (kingdoms[i].equals(searchEl)) {
                System.out.println("Search element is on position: " + i);
            }
        }
        
        // updating array:
        kingdoms[2] = "kingdom2";
        // kingdoms[4] = "k4"; // tohle throwne error => YOU CANNOT CHANGE LENGTH OF ARRAY
        System.out.println(Arrays.toString(kingdoms));


        // reference trap
        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = arr1;
        arr2[0] = 5;
        System.out.println(Arrays.toString(arr1)); // [5, 2, 3]
        System.out.println(Arrays.toString(arr2)); // [5, 2, 3]

        // both variables share the same reference!!!!!!!!!!!!!

        int[] arr3 = new int[3];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }

        arr3[0] = 6;
        System.out.println(Arrays.toString(arr1)); 
        System.out.println(Arrays.toString(arr3)); 

        // BETTER SOLUTION:
        int[] arr4 = Arrays.copyOf(arr1, arr1.length); // chceme nakopoirovat cely ten arr1
        arr4[0] = 7;

        System.out.println(Arrays.toString(arr1)); 
        System.out.println(Arrays.toString(arr4));
        

        // 2D arrays:

        int[][] grades = {
            {1,1,2,2},
            {3,2,1,4},
            {4,4,4,2},
        };

        System.out.println(Arrays.toString(grades[0]));

        int[][] grades2 = new int[3][2]; // 3 radky a 4 sloupce

        grades2[0][0] = 72;
        grades2[0][1] = 85;
        grades2[1][0] = 94;

        System.out.println(Arrays.toString(grades2[0]));

        char[][] board = {
                { 'O', 'O', 'O' },
                { 'O', 'X', 'X' },
                { 'X', 'O', 'X' },
        };

        int[][][] configurations = {
                { { 0, 0 }, { 0, 1 }, { 0, 2 } },
                { { 0, 0 }, { 1, 0 }, { 2, 0 } },
                { { 0, 0 }, { 1, 1 }, { 2, 2 } },
                // ....
        };

        for (int[][] config : configurations) {
            int[] cell1 = config[0];
            int[] cell2 = config[1];
            int[] cell3 = config[2];

            if (board[cell1[0]][cell1[1]] == board[cell2[0]][cell2[1]] &&
                    board[cell2[0]][cell2[1]] == board[cell3[0]][cell3[1]]) {
                System.out.println("User: " + board[cell1[0]][cell1[1]] + " wins!");
            }
        }

    }
}