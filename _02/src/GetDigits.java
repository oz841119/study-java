import java.util.Scanner;

public class GetDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Plz input a three-digit number");
        int number = sc.nextInt();

        int unit_digit = number % 10;
        int tens_digit = number / 10 % 10;
        int hundreds_digit = number / 100 % 10;

        System.out.println(unit_digit);
        System.out.println(tens_digit);
        System.out.println(hundreds_digit);
    }
}