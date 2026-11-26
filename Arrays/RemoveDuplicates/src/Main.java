public class Main {
    public static void removeDuplicates(int[] arr) {
        int count = 1;
        int temp = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(temp == arr[i]) {
                temp = arr[i];
            }
            else {
                arr[count] = arr[i];
                count += 1;
                temp = arr[i];
            }
        }
        for(int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Unique Elements: " + count);
    }
    static void main() {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(arr);
    }
}