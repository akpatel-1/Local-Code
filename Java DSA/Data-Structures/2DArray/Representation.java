import java.util.*;

public class Representation {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        Scanner scan = new Scanner(System.in);

        // Input: row-wise
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter 3 elements for row " + (i + 1) + " separated by spaces: ");
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        // Output
        System.out.println("\nMatrix is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        scan.close();
    }
}
