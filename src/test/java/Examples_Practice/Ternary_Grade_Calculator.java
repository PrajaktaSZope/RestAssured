package Examples_Practice;

public class Ternary_Grade_Calculator {
    public static void main(String[] args) {
        String grade = args[0];
        int marks = Integer.parseInt(grade);
        String result = (marks<59) ? "F" : (marks<69) ? "D" : (marks<79) ? "C" :(marks<89) ? "B" :"A";
        System.out.println(result);

    }
}
