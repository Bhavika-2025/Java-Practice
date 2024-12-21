package string_based_questions;

public class StringBuilder_Operation {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Bhavika");

        // check charAt index 0
        System.out.println(str.charAt(0));

        //set the character at 0 char 'S'
        str.setCharAt(0, 'S');
        System.out.println("Set - " + str);

        //insert the character at 3
        System.out.println("Insert - " + str.insert(3, 'n'));

        //Delete character
        System.out.println("Delete - " + str.delete(5, 7));

        //append Character
        System.out.println("Append - " + str.append(" Chavan"));
    }
}
