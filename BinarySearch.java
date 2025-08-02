public class BinarySearch {
    public static int search(int arr[], int target) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            // comparisons
            if (arr[mid] == target) { // found
                return mid;
            }
            if (arr[mid] < target) { // right
                start = mid + 1;
            } else { // left
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3,4 };
        System.out.print(search(arr, 5));
    }
}
