package Ex001_JavaBasic;

public class Lab02_StarPattern {
        public static void main(String[] args) {
            int rows = 5; // Number of rows for the star pattern

            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            System.out.println("Done");
        }
}

