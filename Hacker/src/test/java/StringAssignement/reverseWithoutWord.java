package StringAssignement;

//Input String="Java concept of the day"
//Output String="day the of concept Java"
public class reverseWithoutWord {

    public static void main(String[] args) {
       String str = "Java concept of the day";
       String reverseString ="";
       String [] words = str.split(" ");
       for(int i =0;i<words.length;i++){
           if (i==words.length) {
               reverseString = reverseString + words[i];
           }
           else
           {
               reverseString = " " + words[i] + reverseString;
           }
       }
        System.out.println("InPut String -- "+str);
        System.out.println("OutPut String -- "+reverseString.trim());
    }
}
