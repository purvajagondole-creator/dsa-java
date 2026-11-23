public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        reverse(numbers);
        System.out.println("Reversed Array: " + Arrays.toString(numbers));
    }

    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
