package ArrayAssignement;
//12456678
public class sortArray
{
    public static void main(String[] args)
    {
        int arr[] ={6,4,8,1,5,6,2,7};
        int temp;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i]);
        }
        System.out.println();
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }
}
