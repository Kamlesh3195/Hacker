package StringAssignement;
//Input String="Java concept of the day"
//Output String="AvAj TpEcNoC fO eHt yAd"
public class reverseWordInStringUL {
    public static void main(String[] args) {
        String str = "Java concept of the day";
        StringBuilder sbObject = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(i%2==0){
                sbObject.append(Character.toLowerCase(str.charAt(i)));
            }
            else{
                sbObject.append(Character.toUpperCase(str.charAt(i)));
            }
        }
        String changeOne = sbObject.toString();
        System.out.println(changeOne);
        String revString="";
        String [] words = changeOne.split(" ");
        for(int i=0;i<words.length;i++){
            String reverseObj = "";
            for(int j=words[i].length()-1;j>=0;j--){
                reverseObj = reverseObj + words[i].charAt(j);
            }
            revString = revString + reverseObj +" ";
        }

        System.out.println(revString);
    }
}
