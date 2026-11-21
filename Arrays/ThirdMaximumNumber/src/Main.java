public class Main {
    public static int thirdMax(int[] arr) {
        Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;

        for (int i = 0; i < arr.length; i++) {
            if (max1 != null && arr[i] == max1) {
                continue;
            }
            if (max2 != null && arr[i] == max2) {
                continue;
            }
            if (max3 != null && arr[i] == max3) {
                continue;
            }

            if (max1 == null || arr[i] > max1) {
                max3 = max2;
                max2 = max1;
                max1 = arr[i];
            } else if (max2 == null || arr[i] > max2) {
                max3 = max2;
                max2 = arr[i];
            } else if (max3 == null || arr[i] > max3) {
                max3 = arr[i];
            }
        }

        if (max3 == null) {
            return max1;   // fewer than 3 distinct numbers
        }
        return max3;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 2, 1};
        System.out.println("Third Maximum Number of Array 1: " + thirdMax(arr1));
        int[] arr2 = {1, 2};
        System.out.println("Third Maximum Number of Array 2: " + thirdMax(arr2));
        int[] arr3 = {2, 2, 3, 1};
        System.out.println("Third Maximum Number of Array 3: " + thirdMax(arr3));
    }
}