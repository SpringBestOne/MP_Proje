import java.util.Scanner;

public class TechnicalQuestionaireCoding {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a number");
        int num = scan.nextInt();//5
        int n1 = 0, n2 = 1;
        System.out.println(num + " sayisinin fibonacci sayilari :");
        for (int i = 1; i < num; i++) {
            System.out.print(n1 + " + ");
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
        System.out.println("");
        if (num % 2 == 0) {
            System.out.println(num + " is not odd number");
        }else System.out.println(num + " is odd number");
        boolean prime = true;
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }
        if (prime) {
            System.out.println(num + " is prime number");
        }else System.out.println(num + " is not prime number");
    }

        }



