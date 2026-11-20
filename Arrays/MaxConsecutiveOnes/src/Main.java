public class Main {
    public static int maxConsecutiveOnes(int[] arr) {
        int count = 0;
        int max = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) {
                count += 1;
                if(count > max) {
                    max = count;
                }
            }
            else {
                count = 0;
            }
        }
        return max;
    }
    static void main() {
        int[] arr = {1, 1, 0, 1, 1, 1};
        int result = maxConsecutiveOnes(arr);
        System.out.println("Max Consecutive Ones: " + result);
    }
}