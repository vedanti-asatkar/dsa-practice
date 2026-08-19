package recursion;
class NtoOne{
    public static void main(String[] args) {
        numbers(7);
    }
    private static void numbers(int n){
        if(n<1){
            return;
        }
        System.out.println(n);
        numbers(n-1);
    }
}