import java.util.*;

public class lowest_number {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a < b && a < c) {
            System.out.println("a is lowest number");
        } else if (b < a && b < c) {
            System.out.println("b is lowest number");
        } else {
            System.out.println("c is lowest number");
        }
    }
}
