package string_based_questions;

public class concatination {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        String N1 = "Bhavika";
        String N2 = "Chavan";
        String fullname = N1 + N2;
        System.out.println("Full Name is: " + fullname);
        System.out.println("Length of the string is: " + fullname.length());

        //charAt() function
        for (int i = 0; i < N1.length(); i++) {

            System.out.print(i + " ");
            System.out.println(N1.charAt(i));

        }

        //compare the strings
        if (N1.compareTo(N2) == 0) {
            System.out.println("String equal");
        } else {
            System.out.println("String not equal");
        }

        //substrings
        String sentence = "My name is Bhavika.";
        String name = sentence.substring(8);
        System.out.println(name);

        //string to integer
        String str = "123";
        int num = Integer.parseInt(str);
        System.out.println(num);

        //integer to string
        int num1 = 234;
        String str1 = Integer.toString(num1);
        System.out.println(str1.length() + " " + str1);
    }
}
