package StringAssignement;
//Input=ApPLe MaNgo
//Output=aPplE mAnGO
public class u2LandL2U {
    public static void main(String[] args) {
        String str = "ApPLe MaNgo";
        String output = " ";
        for(int i=0;i<str.length();i++)
        {
            if(Character.isUpperCase(str.charAt(i))){
                output = output + Character.toLowerCase(str.charAt(i));
            }
            else
            {
                output =output + Character.toUpperCase(str.charAt(i));
            }
        }
        System.out.println(output);
    }
}
