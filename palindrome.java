public class palindrome {
    public static void main(String[] args) {
        String s="naman";
        System.out.println(isPalindrome(s));
    }
    private static boolean isPalindrome(String s){
        if(s.length()==0 || s.length()==1){
            return true;
        }
        char first=s.charAt(0);
        char last=s.charAt(s.length()-1);
        if(first!=last){
            return false;
        }
        return isPalindrome(s.substring(1, s.length()-1));
    }
}
