package Ex001_JavaBasic;

public class Lab03_InvertedStarPattern {
        public static void main(String[] args) {
            int rows = 5; // Number of rows for the triangle

            for (int i = rows; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            System.out.println("Done");
        }
    }


