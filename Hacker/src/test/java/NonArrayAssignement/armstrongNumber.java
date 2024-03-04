package NonArrayAssignement;

public class armstrongNumber {
    public static void main(String[] args) {
        int number = 154;
        int expectedNumber = number;
        int num = number;
        int reminder = 0;
        int length=0;
        int actualNumber = 0;
        //length of number
        while(num!=0)
        {
            num = num/10;
            length ++;
        }
        //System.out.println("Length of given number = "+length);
        while(number!=0)
        {
            int mul = 1;
            reminder = number%10;
            for(int i=0;i<length;i++)
            {
                mul = mul*reminder;
            }
            actualNumber = actualNumber + mul;
            number =number/10;
        }
        if (expectedNumber == actualNumber){
            System.out.println(actualNumber + "- is Armstrong Number ");
        }
        else {
            System.out.println(actualNumber + "- is not Armstrong Number ");
        }

    }
}
