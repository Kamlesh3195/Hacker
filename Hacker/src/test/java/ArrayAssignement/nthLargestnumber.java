package ArrayAssignement;

public class nthLargestnumber
{
    public static void main(String[] args)
    {
        int n =4;
        int arr[]={5,8,12,7,6,2,4,90};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
               if (arr[i]< arr[j])
                {
                   int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            if (i==n-1)
            {
                System.out.println("Nth largest number -" + arr[i]);
            }
        }
        for(int i =0;i<arr.length;i++)
        {
            System.out.print(arr[i] +" ");
        }
    }
}
