package Variable_Identifier_Operator;

public class Lab49_OR_OPERATOR_EXC {
    public static void main(String[] args) {
        int a = 12;
        boolean b = !(a > 10 || a < 10); // BODMAS Principle-->{Bracket of, Division,Multiplication,Addition,Subtraction}
        System.out.println(b);
    }
}
