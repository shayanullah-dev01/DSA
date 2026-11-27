public class Main {
    public static int removeElement(int[] arr, int value) {
        int count = arr.length;
        int temp = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == value) {
                count--;
            }
            else {
                arr[temp] = arr[i];
                temp++;
            }
        }
        return count;
    }

    static void main() {
        int[] arr = {0,1,2,2,3,0,4,2};
        int result = removeElement(arr, 2);
        System.out.println("Remaining No of Elements: "+ result);
    }
}