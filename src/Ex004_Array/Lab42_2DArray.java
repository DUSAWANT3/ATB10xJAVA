package Ex004_Array;

public class Lab42_2DArray {
    public static void main(String[] args) {
    // 1D --> int[]a = new[3] ; ---> {1,2,3}

    //Matrix format--2D array
        int[][] array2D  =new int[3][3];
        array2D[0][0] = 90;
        array2D[0][1] = 80;
        array2D[0][2] = 70;

        array2D[1][0] = 60;
        array2D[1][1] = 50;
        array2D[1][2] = 40;

        array2D[2][0] = 30;
        array2D[2][1] = 20;
        array2D[2][2] = 10;

        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j] + " | ");
            }
            System.out.println();
        }

    }
}
