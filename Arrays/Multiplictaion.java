import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First Matrix");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Second Matrix");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] b = new int[r2][c2];
        for(int i = 0; i < r2; i++){
            for(int j = 0; j < c2; j++){
                b[i][j] = sc.nextInt();
            }
        }
        if(c1 != r2){
            return;
        }
        int[][] mul = new int[r1][c2];
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c2; j++){
                mul[i][j] = 0;
                for(int k = 0; k < c1; k++){
                    mul[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }
        for(int i = 0; i < mul.length; i++){
            for(int j = 0; j < mul[i].length; j++){
                System.out.print(mul[i][j] + " ");
            }
            System.out.println();
        }

    }
}
