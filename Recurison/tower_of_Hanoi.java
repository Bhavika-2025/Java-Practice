package recursion;

public class tower_of_Hanoi {

    public static void tohanoi(int n, String src, String helper, String dest) {

        if (n == 1) {
            System.out.println("Tower " + n + " is transfer from " + src + "to" + dest);
            return;
        }
//transfer top (n-1) from src to helper using dest as helper
        tohanoi(n - 1, src, dest, helper);
        System.out.println("transfer top " + n + "from " + src + "to" + helper);

        //transfer top (n-1) from src to helper using dest as helper
        tohanoi(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        int n = 4;
        tohanoi(n, "A", "B", "C");
    }

}
