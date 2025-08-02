public class LinearSearch {
    public static boolean search(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 3, 6, 7, 0 };
        System.out.println(search(arr, 0));
    }
}