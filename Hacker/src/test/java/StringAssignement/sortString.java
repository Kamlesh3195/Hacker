package StringAssignement;

public class sortString {
    public static void main(String[] args) {
        String[] str ={"deep","amit","vir","rahul"};
        String temp;
        for(int i =0;i<str.length;i++){
            for(int j=i+1;j<str.length;j++){
                if (str[i].compareTo(str[j])>0) {
                    temp = str[j];
                    str[j] = str[i];
                    str[i] = temp;
                }

            }

        }
        for(int i =0;i<str.length;i++){
            System.out.print(str[i] + " ");
        }
    }
}
