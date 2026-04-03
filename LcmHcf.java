import java.util.Scanner;
public class LcmHcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int a = sc.nextInt();
        System.out.print("Enter second number:");
        int b = sc.nextInt();
        int lcm = (a * b)/Hcf(a,b);
        System.out.println("LCM of " + a + " and " + b + " : "+lcm);
        System.out.println("HCF of " + a + " and " + b + " :" + Hcf(a, b));
        sc.close();
    }
    public static int Hcf(int a , int b) { // Euclid's Algorithm
        int temp = 0;
        while(b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
