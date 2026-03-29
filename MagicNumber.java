public class MagicNumber {
    public static void main(String[] args) {
        int number = 145; // You can change this number to check if it's a magic number
        int sum = 0;
        
        while (number > 0 || sum > 9) {
            if (number == 0) {
                number = sum;
                sum = 0;
            }
            sum += number % 10;
            number /= 10;
        }
        
        if (sum == 1) {
            System.out.println("The number is a Magic Number.");
        } else {
            System.out.println("The number is not a Magic Number.");
        }
    }
}
