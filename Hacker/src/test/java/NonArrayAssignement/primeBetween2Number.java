package NonArrayAssignement;
/*Prime number between 0 and 20*/
public class primeBetween2Number {
    public static void main(String[] args) {
        int number = 20;
        for(int i=0;i<=number;i++){
            int count = 0;
            for(int j=2;j<=i-1;j++){
                if(i%j==0){
                    count = count +1;
                }
            }
            if(count==0){
                System.out.println(i);
            }
        }
    }
}
