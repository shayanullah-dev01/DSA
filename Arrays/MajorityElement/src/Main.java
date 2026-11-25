public class Main {
    public static int majorityElement(int[] arr) {
        int maxCount = 0;
        int maxElement = 0;
        for(int i = 0; i < arr.length; i++) {
            int count = 0;
            for(int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    count += 1;
                    if(count > maxCount) {
                        maxCount = count;
                        maxElement = arr[i];
                    }
                }
            }
        }
        return maxElement;
    }
    static void main() {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Majority Element: " + majorityElement(arr));
    }
}