package StringAssignement;
//Input String="Java concept of the day"
//Output String="avaJ tpecnoc fo eht yad"
public class reverseEachWordInString {
    public static void main(String[] args) {

         String str = "Java concept of the day";
         String reverseString ="";
         String [] words = str.split(" ");
            for(int i = 0; i < words.length; i++){
                String reverse=" ";
                for(int j = words[i].length()-1;  j >= 0; j--){
                    reverse = reverse + words[i].charAt(j);
                }
                reverseString = reverseString + reverse +"";
            }
            System.out.println("InPut String--"+str);
            System.out.println("OutPut String--"+reverseString);
    }
}

