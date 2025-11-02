import java.util.*;

public class Main {
    static void printSpiral(int[][] arr, int r, int c) {
        int topRow = 0, leftCol = 0, bottomRow = r - 1, rightCOl = c - 1;
        int totalElement = 0;
        while (totalElement < r * c) {
            for (int j = leftCol; j <= rightCOl && totalElement < r * c; j++) {
                System.out.println(arr[topRow][j]);
                totalElement++;
            }
            topRow++;

            for (int i = topRow; i <= bottomRow && totalElement < r * c; i++) {
                System.out.println(arr[i][rightCOl]);
                totalElement++;
            }
            rightCOl--;

            for (int j = rightCOl; j >= leftCol && totalElement < r * c; j--) {
                System.out.println(arr[bottomRow][j] + " ");
                totalElement++;
            }
            bottomRow--;

            for (int i = bottomRow; i >= topRow && totalElement < r * c; i--) {
                System.out.println(arr[i][leftCol]);
                totalElement++;
            }
            leftCol++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input Matrix");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Spiral Matrix");
        printSpiral(arr, r, c);

    }
}
