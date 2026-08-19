package recursion;
public class sum {
    public static void main(String[] args) {
        int n=1234;
        System.out.println(sums(n));
    }
    private static int sums(int n){
        if(n==0){
            return 0;
        }
        return n%10 + sums(n/10);
    }
}
