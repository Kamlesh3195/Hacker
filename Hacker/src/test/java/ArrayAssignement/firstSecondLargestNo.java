package ArrayAssignement;
// To find the First and Second largest number in array
public class firstSecondLargestNo {
    public static void main(String[] args) {
        int[] arr = {60, 80, 7, 89, 56, 6, 98, 66};
        int fLargest = Integer.MIN_VALUE;
        int sLargest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if (arr[i]>fLargest)
            {
               sLargest =fLargest;
               fLargest =arr[i];
            }
            else if ((arr[i]>sLargest)&&(arr[i]!=fLargest ))
            {
                sLargest = arr[i];
            }
        }
        if (sLargest == Integer.MIN_VALUE)
        {
            System.out.println("There is no second largest");
        }
        else
        {
            System.out.println("Second Largest Number - " +sLargest );
        }
        System.out.println("First Largest Number - " +fLargest );
    }
}