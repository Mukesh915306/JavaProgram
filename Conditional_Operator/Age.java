import java.util.*;

public class Main{
    public static void main(String[] args) {
        System.out.println("Enter the age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age <= 12){
            System.out.println("Child");
        }
        else if(age > 12 && age < 18){
            System.out.println("teenager");
        }
        else{
            System.out.println("Adult");
        }
    }
}
