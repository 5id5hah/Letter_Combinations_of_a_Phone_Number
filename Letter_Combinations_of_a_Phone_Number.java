import java.util.ArrayList;

public class Letter_Combinations_of_a_Phone_Number {
    public static void main(String[] args) {
        phon("", "12");
        System.out.println();
        System.out.println(phonp("", "12"));
        System.out.println(phoncount("","12"));


    }

    public static void phon(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p+" ");
            return;

        }
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            phon(p + ch, up.substring(1));


        }
    }

    public static ArrayList<String> phonp(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;


        }
        int digit1 = up.charAt(0) - '0';
        ArrayList<String> ans = new ArrayList<>();
        for (int i = (digit1 - 1) * 3; i < digit1 * 3; i++) {
            char ch = (char) ('a' + i);
            ans.addAll(phonp(p + ch, up.substring(1)));


        }
        return ans;

    }

    public static int phoncount(String p, String up) {
        if (up.isEmpty()) {

            return 1;

        }
        int digit = up.charAt(0) - '0';
        int count = 0;
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
          count=count+ phoncount(p + ch, up.substring(1));


        }
return count;
    }
}


