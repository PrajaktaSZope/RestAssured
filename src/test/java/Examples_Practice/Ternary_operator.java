package Examples_Practice;

public class Ternary_operator {
    public static void main(String[] args) {
        //int age = 70;
        //String canIVote = age>18 ? "Yes you can vote" : "No you cannot vote";
        //System.out.println(canIVote);
        int number = -2;
        String result = (number > 0) ? (number > -90 ? "Is greater than zero" : "Is less than zero and negative"):"Is positive";
        System.out.println(result);

    }
}
