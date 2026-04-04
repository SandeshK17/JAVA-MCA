import java.util.Scanner;
public class PerfectNumber {                    // A perfect number is a number whose sum of all factors equals to that number.
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        for(int i = 1; i < n; i++){
            if(n % i == 0) {
                sum += i;
            }
        }
        if(n == sum) {
            System.out.println("It is a perfect number");
        }
        else{
            System.out.println("It is not a perfect number");
        }
        sc.close();
    }
}
