public class multi_dimensional_arrays {
    public static void main(String[] args){
        int[][] array = new int[5][4];

        // row 0

        array[0][0] = 12;
        array[0][1] = 24;
        array[0][2] = 41;
        array[0][3] = 12;

        // row 1

        array[1][0] = 11;
        array[1][1] = 212;
        array[1][2] = 123;
        array[1][3] = 23;

        // row 2

        array[2][0] = 11;
        array[2][1] = 12;
        array[2][2] = 43;
        array[2][3] = 67;

        // row 3

        array[3][0] = 13;
        array[3][1] = 0;
        array[3][2] = 2;
        array[3][3] = 6;

        // row 4

        array[4][0] = 3;
        array[4][1] = 5;
        array[4][2] = 3;
        array[4][3] = 9;

        for (int i = 0 ; i < 4; i++){
            for (int j = 0 ; j < 3 ; j++){
                System.out.println(array[i][j]);
            }
        }

    }
}
