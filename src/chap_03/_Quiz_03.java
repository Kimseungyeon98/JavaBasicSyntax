package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String pn1 = "901231-1234567";
        System.out.println(pn1.substring(0,8));
        String pn2 = "030708-4567890";
        System.out.println(pn2.substring(0,pn2.indexOf("-")+2));
    }
}
