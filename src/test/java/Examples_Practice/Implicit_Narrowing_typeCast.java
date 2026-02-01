package Examples_Practice;

public class Implicit_Narrowing_typeCast {
    public static void main(String[] args) {
        int a=200;
       // byte b = val; this gives error as we are trying to convert byte to int from less to more
        byte b = (byte)a; /// this is explicit narrowing of data int to byte means more to less
        System.out.println(b);
    }
}
