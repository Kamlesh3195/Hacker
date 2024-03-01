package StringAssignement;
//Input String="Java concept of the day"
//Output String="Java Concept Of The Day"
public class firstCharUpper
{
    public static void main(String[] args)
    {
        String str = "java concept of the day";
        String strWithSpace =" " + str;
        String actualString = " ";
        for(int i=0;i<str.length();i++){
            if(strWithSpace.charAt(i) == ' ' && strWithSpace.charAt(i+1)!= ' ')
            {
                actualString = actualString +Character.toUpperCase(strWithSpace.charAt(i+1));
            }
            else
            {
                actualString = actualString +strWithSpace.charAt(i+1);
            }
        }
        System.out.println(strWithSpace.trim());
        System.out.println(actualString.trim());
    }
}



