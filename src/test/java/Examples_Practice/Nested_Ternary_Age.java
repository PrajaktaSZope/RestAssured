package Examples_Practice;

public class Nested_Ternary_Age {
    public static void main(String[] args) {
        String age = args[0];
       // System.out.println(age);
        int age1 = Integer.parseInt(age);
        String result = (age1<18) ? "mINOR" :(age1>65) ? "Senior" : "Adult";
        System.out.println(result);

    }
}
