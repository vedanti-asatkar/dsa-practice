class Solution{
    public int NthRoot(int N, int M) {
        if(M==0){
            return 0;
        }
        int low=1;
        int high=M;
        while(low<=high){
            int mid=(low+high)/2;
            int power=1;
            for(int i=1; i<=N; i++){
                power*=mid;
                if(power>M){
                    break;
                }
            }
            if(power==mid){
                    return mid;
                }else if(power<M){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
        }
        return -1;
    }
}
public class nthInteger {
    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.NthRoot(3, 27));
    }
}
