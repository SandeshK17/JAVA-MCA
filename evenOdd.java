import java.util.Scanner;
class evenOdd {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to be checked as even or odd:");
        num = sc.nextInt();
        if(num % 2 == 0) {
            System.out.println(num + " is an Even number.");
        }
        else{
            System.out.println(num + " is an Odd number.");
        }
        sc.close();
    }
}