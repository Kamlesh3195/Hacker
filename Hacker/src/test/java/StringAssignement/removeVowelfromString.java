package StringAssignement;
//inputString = "Java concept of the day";
//OutputString = J#v# c#nc#pt #f th# d#y
//OutputString = J v  c nc pt  f th  d y
public class removeVowelfromString {
    public static void main(String[] args) {
        String inputString = "Java concept of the day";
        StringBuffer sb = new StringBuffer(inputString);
        for(int i =0;i<sb.length();i++)
        {
            if(sb.charAt(i)=='a'||sb.charAt(i)=='e'||sb.charAt(i)=='i'||sb.charAt(i)=='o'||sb.charAt(i)=='u')
            {
                sb.setCharAt(i,'#');
            }
        }
        System.out.println(sb.toString());
    }
}
