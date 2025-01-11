package Ex001_JavaBasic;

public class Lab04_Table_P2 {

    public static void main(String[] args) {
        int rows = 10, columns = 10;

        // Print column headers
        System.out.printf("%4s", ""); // Padding for the top-left corner
        for (int i = 1; i <= columns; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
       System.out.println("   " + "-".repeat(columns * 4)); // Line separator

        // Print rows

        for (int i = 1; i <= rows; i++) {
            System.out.printf("%4d", i); // Row header
            for (int j = 1; j <= columns; j++) {
                System.out.printf("%4d", i * j); // Cell data
            }
            System.out.println();
        }
    }
}
