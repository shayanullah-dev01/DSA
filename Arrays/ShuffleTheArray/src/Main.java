public class Main {
    public static int[] shuffleTheArray(int[] arr) {
        int n = arr.length;
        int half = n / 2;
        int[] result = new int[n];

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                result[i] = arr[i / 2];
            } else {
                result[i] = arr[half + i / 2];
            }
        }
        return result;
    }
    static void main() {
        int[] arr = {2, 5, 1, 3, 4, 7};
        int[] result = shuffleTheArray(arr);

        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}