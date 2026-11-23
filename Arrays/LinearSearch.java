public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -12, 28};
        int target = 23;
        boolean ans = linearSearch(nums, target);
        System.out.println(ans);
    }
    static boolean linearSearch(int[] arr, int target) {
        if(arr.length == 0){
            return false;
        }

        for(int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if(element == target){
                return true;
            }
        }
      
        return false;
    }
}
