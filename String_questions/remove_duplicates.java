package string_based_questions;

public class repeat {

    public static void main(String[] args) {
        String str = "abdabcaabcaadd";

        // 1st approach
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char arr = str.charAt(i);
            int idx = str.indexOf(arr, i + 1);
            if (idx == -1) {
                sb.append(arr);
            }
        }
        System.out.println(sb);

        System.out.println();

        // 2nd approach
        char[] arr = str.toCharArray();
        boolean repeated = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    repeated = true;
                    break;
                }
            }
            if (!repeated) {
                sb.append(arr[i]);
            }
        }
        System.out.print(sb);
    }
}
