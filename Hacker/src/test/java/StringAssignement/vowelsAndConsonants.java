package StringAssignement;

public class vowelsAndConsonants
{
    public static void main(String[] args)
    {
        String inputString = "Java concept of the day";
        String vowel=" ";
        String consonant=" ";
        int count = 0;
        int total = 0;
        for(int i=0;i<inputString.length();i++)
        {

            char ch = inputString.charAt(i);
            if (ch!=' ') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowel = vowel+ " " + ch;
                    count++;
                } else {
                    consonant = consonant+" " + ch;
                    total++;
                }
            }
        }

        System.out.print("Total number of vowel--" + count + "--"+vowel);
        System.out.println();
        System.out.print("Total number of consonant--" + total + "--"+consonant);
        System.out.println();
        System.out.println(vowel+consonant);

    }
}
