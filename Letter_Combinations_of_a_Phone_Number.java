public class Letter_Combinations_of_a_Phone_Number {
    public static void main(String[] args) {
        phon("","12");


    }
    public static void phon(String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;

        }
        int digit=up.charAt(0)-'0';
        for (int i = (digit-1)*3; i <digit*3 ; i++) {
            char ch=(char)('a'+i);
            phon(p+ch,up.substring(1));


        }
    }
}
