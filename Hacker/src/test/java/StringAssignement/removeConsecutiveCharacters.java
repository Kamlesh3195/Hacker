package StringAssignement;

public class removeConsecutiveCharacters {
/*    Input: S = aaaabbaaa
    Output: S = aba*/
    public static void main(String [] args){
        String str ="aaaabbaaa";
        String newString = " ";
        for(int i=0;i< str.length();i++){
            char c = str.charAt(i);
            if(i==0 || c!= str.charAt(i-1)){
               newString = newString + c;
            }
        }
        System.out.print(newString);

    }
}
