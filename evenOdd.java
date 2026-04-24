import java.util.Scanner;
class evenOdd {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to be checked as even or odd:");
        num = sc.nextInt();
        if(num % 2 == 0) { // If a number is even the remainder is zero
            System.out.println(num + " is an Even number.");
        }
        else{ // If the remainder is not 0 number is odd
            System.out.println(num + " is an Odd number.");
        }
        sc.close();
    }
}
