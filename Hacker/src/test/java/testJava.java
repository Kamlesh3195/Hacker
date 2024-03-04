//Input String="Java concept of the day"
//Output String="AvAj TpEcNoC fO eHt yAd"
public class testJava {
    public static void main(String[] args) {
        int[] arr = {60, 80, 7, 89, 56, 6, 98, 66};
        int fl = Integer.MIN_VALUE;
        int sl = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > fl) {
                sl = fl;
                fl = arr[i];
            } else if (arr[i] > sl) {
                sl = arr[i];
            }
        }
        if (sl == Integer.MIN_VALUE) {
            System.out.println("no");
        }
        else{
            System.out.println(sl);
            System.out.println(fl);
        }

    }
}