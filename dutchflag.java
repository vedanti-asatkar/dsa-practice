class Solution{
    public void sortColors(int[] nums){
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                mid++;
                low++;
            }else if(nums[mid]==2){
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }else if(nums[mid]==1){
                mid++;
            }
        }
    }
}
public class dutchflag {
    public static void main(String[] args) {
        int [] nums={2,0,2,1,1,0};
        Solution s=new Solution();
        s.sortColors(nums);
    }
}
