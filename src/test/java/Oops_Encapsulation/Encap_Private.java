package Oops_Encapsulation;

public class Encap_Private {
    public static void main(String[] args) {
        GoodVWOLogin vwoLogin = new GoodVWOLogin("admin","new123");
        //System.out.println(vwoLogin.password);
        //vwoLogin.password = "345";
        //System.out.println(vwoLogin.password);

        vwoLogin.setUsername("Prajakta");
        System.out.println(vwoLogin.getUsername());
        System.out.println(vwoLogin.getPassword());
        vwoLogin.setPassword("xoxo",false);
        System.out.print(vwoLogin.getPassword());


    }

}

class GoodVWOLogin {
    private String username;
    private String password;

    public GoodVWOLogin(String usr, String pwd) {

        this.username =usr;
        this.password =pwd;
}
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, Boolean isAdmin) {
        if(isAdmin){
            this.password = password;
        }
        else{
            System.out.println("You are not allowed to change the password  ");
        }
        this.password = password;
    }
}
