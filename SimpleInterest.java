import java.util.Scanner;
public class SimpleInterest { // This program calculate both Simple interest and compound interest.
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Principal:");
       float p = sc.nextFloat();
       System.out.print("Enter Rate of Interest:");
       float r = sc.nextFloat();
       System.out.print("Enter Time:");
       int t = sc.nextInt();
       double si = (p*r*t)/100;
       double a = p*(Math.pow((1 + r/100),t));
       double ci = a - p;
       System.out.println("Simple Interest:" + si);
       System.out.println("Compound interest:" + ci);
       sc.close();
    }
}
