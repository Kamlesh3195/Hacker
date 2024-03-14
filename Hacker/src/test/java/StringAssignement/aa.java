package StringAssignement;

import java.util.Scanner;

public class aa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        //taking string input from user
        Scanner scs = new Scanner(System.in);
        System.out.println("Enter string array");
        int size1 = scs.nextInt();
        String [] str = new String[size1];
        for(int i=0;i<size1;i++){
            str[i] = scs.nextLine();
        }


    }

}
