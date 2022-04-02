package Bank;

public class bank {
    public static void main(String[] args){
        Account a1 = new Account();
        a1.name="Devansh";
        a1.email="devansh@gmail.com";
        a1.setPassword("abcd");
        System.out.println(a1.getPassword());
    }
}
class Account{
    String name;
    String email;
    private String password;

    public String getPassword(){
        return this.password;
    }

    void setPassword(String pass){
        this.password=pass;
    }
}

