package NonArrayAssignement;

public class numberPrimeOrNot {
    public static void main(String[] args) {
        int number = 8;
        int count = 0;
        for(int i=2;i<=number-1;i++) {
            if (number % i == 0) {
                count = count + 1;
            }
        }
            if (count==0){
                System.out.println("Number is prime");
            }
            else{
                System.out.println("Number is not prime");
            }
        }

    }

