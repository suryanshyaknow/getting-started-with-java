import java.util.Arrays;

public class Transpose {

    public static int[][] transpose(int[][] arr) {
        int rows = arr.length;
        int columns = arr[0].length;

        int[][] transposedArr = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposedArr[j][i] = arr[i][j];
            }
        }
        return transposedArr;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] tranposedArr = transpose(arr);

        System.out.println("Orginal Array: ");
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println("\nTransposed Array: ");
        for (int[] row : tranposedArr) {
            System.out.println(Arrays.toString(row));
        }
    }
}
