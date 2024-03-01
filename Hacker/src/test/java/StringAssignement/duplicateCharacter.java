package StringAssignement;
import java.util.HashMap;
import java.util.Map;

public class duplicateCharacter {
    public static void main(String[] args) {
        String str="Java concept of the day";
        //Create a hashmap
        Map<Character,Integer> hp = new HashMap<>();
        //Convert the string array to character array
        char[] ch = str.toCharArray();
        for(char c : ch){
            if(hp.containsKey(c) )
            {
                hp.put(c,hp.get(c)+1);
            }
            else
            {
                hp.put(c,1);
            }
        }
        // Iterate over the entries using Map.Entry
        for(Map.Entry<Character,Integer> entry:hp.entrySet())
        {
            if (entry.getValue()>=1) {
                //if (g.getKey() != ' ') {
                    System.out.println(entry.getKey() + " : " + entry.getValue());
               // }
            }
        }
    }
}
