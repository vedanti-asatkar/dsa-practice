class Vote{
    // return the candidate?
    public int voting(int[] nums){
        int candidate=nums[0];
        int count=1;
        for(int i=1; i<nums.length; i++){
            if(nums[i]==candidate){
                count++;
            }else{
                count--;
            }
            if(count==0){
                candidate=nums[i];
                count=1;
            }
        }
        return candidate;
    }
}
class moore{
    public static void main(String[] args) {
        Vote v=new Vote();
        int [] nums={2, 2, 1, 1, 1, 2, 2};
        System.out.println(v.voting(nums));
    }
}