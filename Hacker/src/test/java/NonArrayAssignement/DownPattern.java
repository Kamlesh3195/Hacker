package NonArrayAssignement;
/*      1 2 3 4 5 6
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1
1 2 3 4 5
 1 2 3 4
  1 2 3
   1 2
    1 */


public class DownPattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++ )
        {
            for(int j=1;j<=n-i;j++){
                System.out.print(j + " ");
            }
            System.out.println();

        }

        int number =7;
        for(int i =0;i<=number;i++) {
            //To print space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= number - i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

    }
}
