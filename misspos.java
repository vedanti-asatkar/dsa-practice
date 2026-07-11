class Solution {
    public int findKthPositive(int[] arr, int k) {
        int missing=0;
        int num=0;
        if(isMissing(arr, num)){
            missing++;
        }
    }
    
    public boolean isMissing(int[] arr, int num) {
        for(int i=0; i<arr.length; i++){
            if(num==arr[i]){
                return false;
            }
        }return true;
    }
}
public class misspos {
    public static void main(String[] args) {
        
    }
}
