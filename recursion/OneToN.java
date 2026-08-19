package recursion;
class OneToN{
    public static void main(String[] args) {
        numbers(6);
    }
    private static void numbers(int n){
        if(n<1){
            return;
        }
        numbers(n-1);
        System.out.println(n);
    }
}