class Solution{
    public int minEatingSpeed(int[] piles, int h){
        int low=1;
        int high=0;
        for(int i=0; i<piles.length; i++){
            high=Math.max(piles[i], high);
        }

        while(low<high){
            int mid=(low+high)/2;
            if(canFinish(piles, mid, h)){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    boolean canFinish(int[] piles, int k, int h){
            int hours=0;
            for(int i=0; i<piles.length; i++){
                hours+=(piles[i]+k-1)/k;
            }
            return hours<=h;
        }
}
public class koko {
    public static void main(String[] args) {
        int[]piles={3, 6, 7, 11};
        Solution s=new Solution();
        int h=8;
        System.out.println(s.minEatingSpeed(piles, h));
    }
}
