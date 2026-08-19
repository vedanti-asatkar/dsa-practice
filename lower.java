public class lower {
    public static void main(String[] args) {
        // finding lower bound
        int[] arr={1, 3, 3, 6, 7};
        int target=3;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=target){
                return arr[mid];
            }else{
            }
        }
    }
}
