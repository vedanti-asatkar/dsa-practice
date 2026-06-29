class Solution {
    public int floorSqrt(int n) {
        if(n<=0){
            return 0;
        }
        long low=0;
        long high=n;
        long ans=0;
        while(low<=high){
            long mid=(low+high)/2;
            long val=mid*mid;
            if(val>n){
                high=mid-1;
            }else{
                ans=mid;
                low=mid+1;
            }
        }
        return (int)ans;
    }
}
public class sqrt {
    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.floorSqrt(34));
    }
}

// Brute
// class Solution {
//     public int floorSqrt(int n) {
//         int ans=0;
//       for(int i=0; i<=n; i++){
//         if(i*i<n){
//             ans=i;
//         }
//       }
//       return ans;
//     }
// }
