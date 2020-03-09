public class DiagonalMatrix {
    public static void main(String[] args) {
        // - Create (dynamically) a two dimensional array
        //   with the following matrix. Use a loop!
        //
        //   1 0 0 0
        //   0 1 0 0
        //   0 0 1 0
        //   0 0 0 1
        //
        // - Print this two dimensional array to the output

        int [][] matrix = new int[4][4];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (col == row) {
                    matrix[row][col] = 1;
                }
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

        //just playing with calculating the number of rows and columns of a matrix
        /*int [][] matrix2 = new int[4][5];

        int rows = matrix2.length;
        int cols = matrix2[0].length;

        System.out.println(rows + " and " + cols);*/
    }
}
