package StringAssignement;

public class insertStringInToAnother {
/*  Input: originalString = "GeeksGeeks",
    stringToBeInserted = "For",
    index = 4
    Output: "GeeksForGeeks"*/

/*  Input: originalString = "Computer Portal",
    stringToBeInserted = "Science ",
    index = 8
    Output: "Computer Science Portal"*/
    public static void main(String[] args) {
        String originalString = "Computer Portal";
        String stringToBeInserted = "Science ";
        int index = 8;
        String newString =" ";
        for(int i = 0;i<originalString.length();i++){
            newString = newString +  originalString.charAt(i);
            if(i==index){
                newString = newString + stringToBeInserted;
            }
        }
        System.out.println(newString);

    }
}
