package NonArrayAssignement;
//fibonacci Series -0 1 1 2 3 5 8 13 21 34 55 89 144
public class fibonacciSeries {
    public static void main(String[] args) {
        int number = 10;
        int numberOne =0;
        int numberTwo =1;
        System.out.print(numberOne + " " + numberTwo + " ");
        int sum;
        for(int i=0;i<=number;i++){
            sum = numberOne + numberTwo;
            numberOne = numberTwo;
            numberTwo= sum;
            System.out.print(sum + " ");
        }
    }
}
