public class MaxValue {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};
        
        System.out.println(maxRange(arr, 1, 3));
    }

  
    static long maxRange(int[] arr, int start, int end){
        int maxVal = arr[start];
        for (int i = start; i <= end; i++){
            if(arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;

    }
}
