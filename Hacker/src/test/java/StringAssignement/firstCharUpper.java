package StringAssignement;
//Input String="Java concept of the day"
//Output String="Java Concept Of The Day"
public class firstCharUpper {
    public static void main(String[] args) {

        String str = "java concept of the day";
        String strWithSpace = " " + str;
        String finalString="";
        for(int i=0;i<strWithSpace.length();i++) {
            if (strWithSpace.charAt(i)==' ' && strWithSpace.charAt(i + 1) != ' ') {
                finalString = finalString + " "+ Character.toUpperCase(strWithSpace.charAt(i+1));
                i++;
            }
            else{
                finalString = finalString + strWithSpace.charAt(i);
            }
        }
        System.out.println(finalString.trim());
    }
}



