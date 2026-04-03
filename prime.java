import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        int num, i, flag = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        // Edge Case Handling
        if(num == 1 || num < 1) {
            flag = 0;
        }
        for(i = 2; i < num; i++) {
            if(num % i == 0) {
                flag = 0; // Number is not prime.
            }
        }
        if(flag == 1) {
            System.out.println(num + " is a Prime number.");
        }
        else{
            System.out.println(num + " is not a Prime number.");
        }
        sc.close();
    }
}
