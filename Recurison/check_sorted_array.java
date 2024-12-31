package recursion;

public class check_sorted_array {

    public static boolean check_sort_array(int arr[], int idx) {

        if (idx == arr.length - 1) {
            return true;
        }

        if (arr[idx] < arr[idx + 1]) {
            return check_sort_array(arr, idx + 1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(check_sort_array(arr, 0));
    }

}
