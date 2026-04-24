import java.util.Scanner;
public class factorial {
    public static void main(String[] args) { // Factorial of a number is product of number from 1 to that number.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        long factorial = 1;
        
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        
        System.out.println("Factorial of " + number + " is: " + factorial);
        sc.close();
    }
}
