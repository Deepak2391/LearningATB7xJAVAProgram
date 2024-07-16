package Variable_Identifier_Operator;
// && --> And Gate --> only true and true returns true
/*
T || T -> T
T || F -> F
F || T -> F
F || F -> F
 */
public class Lab48_And_Gate {
    public static void main(String[] args) {
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
    }
}
