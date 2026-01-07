package Oops_Encapsulation;

public class Encap {
    public static void main(String[] args) {
        VWOLogin vwoLogin = new VWOLogin("admin","pass123");
        System.out.println(vwoLogin.password);
        vwoLogin.password = "345";
        System.out.println(vwoLogin.password);
    }
}

class VWOLogin{
    public String username;
    public String password;

    VWOLogin(String usr, String pwd){ // Parameterised constructor
        this.username = usr;
        this.password = pwd;
    }
}
