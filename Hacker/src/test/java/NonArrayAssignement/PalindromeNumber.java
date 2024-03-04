package NonArrayAssignement;
import java.util.Scanner;
public class PalindromeNumber {
    //121
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number -- ");
        int number = sc.nextInt();
        int n=number;
        int reverse =0;

        while (number!=0){
            int reminder = number%10;
            reverse =reverse*10+reminder;
            number = number/10;
        }
        if(n==reverse) {
            System.out.println("Number is Palindrome");
        }
        else {
            System.out.println("Number is not Palindrome");
        }
    }
}
