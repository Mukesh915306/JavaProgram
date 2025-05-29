import java.util.*;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'r':
                System.out.println("Stop");
                break;
            case 'y':
                System.out.println("Ready");
                break;
            case 'g':
                System.out.println("Go");
                break;

            default:
                System.out.println("Invalid character");
                break;
        }
    }
}
