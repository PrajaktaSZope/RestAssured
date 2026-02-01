package Oops_Encapsulation;

public class Encap_Eg1 {
    public static void main(String[] args) {
        ICICIBank amit = new ICICIBank("Amit", 100);
        long bal = amit.getBal();
        System.out.println(bal);
        amit.setBal(500,true);
        long bal_updated = amit.getBal();
       System.out.println(bal_updated);


    }
}

class ICICIBank{

    private String name;
    private long bal;

    public ICICIBank(String name,long bal){
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, Boolean isChashier) {
        if(isChashier){
            System.out.println("u are allowed to change the balance to");
            this.bal = bal;
        }else{
            System.out.println("You are not allot to change the Blance");
        }

    }
}