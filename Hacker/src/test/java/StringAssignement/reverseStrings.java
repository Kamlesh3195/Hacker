package StringAssignement;
//Input String="Java concept of the day"
//Output String="yad eht fo tpecnoc avaJ"
public class reverseStrings {
    public static void main(String[] args) {
        String str ="Java concept of the day";
        String reverse =" ";
        for(int i=str.length()-1;i>=0;i--){
            reverse = reverse + str.charAt(i);
        }
        System.out.println(str);
        System.out.println(reverse.trim());
    }
}
