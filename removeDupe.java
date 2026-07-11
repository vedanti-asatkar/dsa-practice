import java.util.HashSet;

class removeDupe{
    public static void main(String[] args) {
        // brute
        int [] nums={1, 1, 2, 2, 2, 3, 3};
        HashSet<Integer>set=new HashSet<>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        int[] num1 = set.stream().mapToInt(Integer::intValue).toArray();
        for(int i=0; i<num1.length; i++){
            System.out.println(num1[i]);
        }
    }
}