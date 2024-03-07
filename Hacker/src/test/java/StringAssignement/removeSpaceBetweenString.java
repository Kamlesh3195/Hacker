package StringAssignement;

public class removeSpaceBetweenString
{
/*    input --String str = "  Hello   Geeks . Welcome   to      GeeksforGeeks   .    ";
    output --String str = "  Hello Geeks . Welcome to GeeksforGeeks . ";*/
    public static void main(String[] args)
    {
        String str = "  Hello   Geeks . Welcome   to      GeeksforGeeks   .    ";
        String newString = " ";
        boolean flag = false;
        for(int i=0;i<str.length();i++)
        {
            char c = str.charAt(i);
            if(c!=' ' || !flag)
            {
                newString = newString + c;
            }
            flag =(c==' ');
        }
        System.out.println(newString);
    }
}
