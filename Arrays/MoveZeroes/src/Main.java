public class Main {
    public static void moveZeroes(int[] arr) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                count ++;
            }
        }
        while(count != 0) {
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] == 0 && i != arr.length - 1) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            count--;
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void main() {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);
    }
}