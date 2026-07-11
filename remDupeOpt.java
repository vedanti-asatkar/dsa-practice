public class remDupeOpt {
    public static void main(String[] args) {
        int [] nums={1, 1, 2, 2, 2, 3, 3};
        int i=0;
        for(int j=0; j<nums.length; j++){
            if(nums[i]!=nums[j]){
                nums[i+1]=nums[j];
                i++;
            }
        }
        System.out.println(i+1);
    }
}
