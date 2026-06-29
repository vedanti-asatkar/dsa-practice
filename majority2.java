
import java.util.ArrayList;
import java.util.List;
class Solution{
    public List<Integer> majorityElement(int[] nums){
        if(nums.length==0){
            return List.of(nums[0]);
        }
        int candidate1=nums[0];
        int count1=1;
        int candidate2=Integer.MIN_VALUE;
        int count2=0;
        for(int i=1; i<nums.length; i++){
            if(nums[i]==candidate1){
                count1++;
            }else if(nums[i]==candidate2){
                count2++;
            }else if(count1==0){
                candidate1=nums[i];
                count1=1;
            }else if(count2==0){
                candidate2=nums[i];
                count2=1;
            }else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int j=0; j<nums.length; j++){
            if(nums[j]==candidate1)count1++;
            else if(nums[j]==candidate2)count2++;
        }
        List<Integer> result=new ArrayList<>();
        if(count1>nums.length/3)result.add(candidate1);
        if(count2>nums.length/3)result.add(candidate2);
        return result;
    }
}
public class majority2 {
    public static void main(String[] args) {
        Solution s=new Solution();
        int[] nums={3, 2, 3};
        System.out.println(s.majorityElement(nums));
    }
}
