package Variable_Identifier_Operator;

public class Lab34_NewLine_NewTab_Newb_Newr {
    public static void main(String[] args) {
        char    c = '\n';  // New Line
        System.out.println("Deepak" + c + "Kumar");
        char    c1 = '\t'; // New Tab
        System.out.println("Deepak" + c1 + "Kumar");
        char    c2 = '\b'; // Backlash--> delete 1 char(X)
        System.out.println("Deepak" + c2);
        char    c3 = '\r'; // Backlash---> delete 1 word("String")
        System.out.println("Deepak" + c3 + "Kumar");
    }
}
