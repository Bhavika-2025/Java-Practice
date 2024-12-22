package OOPS;

class Account {

    public String name;
    int number;
    protected String email;
    private String PWD;

    public String getPassword() {
        return this.PWD;
    }

    public void setPassword(String pass) {
        this.PWD = pass;
    }
}

public class access_modifiers {

    public static void main(String[] args) {
        Account a1 = new Account();
        a1.name = "Bhavika";
        a1.number = 88570433;
        a1.email = "bhavika@gmail.com";
        a1.setPassword("ABC123");
        System.out.println(a1.getPassword());
    }
}
