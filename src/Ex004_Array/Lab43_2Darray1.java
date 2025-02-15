package Ex004_Array;

public class Lab43_2Darray1 {
    public static void main(String[] args) {

        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};//3X3
          //3x3 -Rows 3, coloum  3
        //matrix.length = row length =3
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j]+" | ");
            }
            System.out.println();
        }
        System.out.println("----------------------");

        }


    }

