public class LoopPattern2 {
    public static void main(String[] args) {
        // Loop through rows
        for (int i = 1; i <= 5; i++) {
            // Print spaces based on row number
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            // Print numbers based on row number
            for (int j = 1; j <= i; j++) {
                System.out.print((2 * j - 1));
                // Check if it's the last number in the row
                if (j != i) {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
}
