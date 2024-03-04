import java.util.HashMap;
import java.util.Map;

public class Testing {
    public static void main(String[] args) {
        String str1 ="Birua";
        String str2 ="Kamlesh";
        str1 = str1+str2;
        str2 = str1.substring(0,str1.length()-str2.length());
        str1= str1.substring(str2.length());
        System.out.println(str1);
        System.out.println(str2);
int a=10;
int b=20;
a=a+b;
b=a-b;
a=a-b;
        System.out.println(a);
        System.out.println(b);

    }
}
