package recursion;
public class reverseNo {
    public static void main(String[] args) {
        String s="vedanti";
        System.out.println(reverse(s));
    }
    private static String reverse(String s){
        if(s.length()==0 || s.length()==1){
            return s;
        }
        char last=s.charAt(s.length()-1);
        return last + reverse(s.substring(0, s.length()-1));
    }
}
