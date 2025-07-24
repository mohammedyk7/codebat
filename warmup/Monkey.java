package warmup;

public class Monkey {
    public String monkeyTrouble(boolean aSmile, boolean bSmile) {
        // Return "true" if both monkeys are smiling or both are not smiling
        return (aSmile == bSmile) ? "true" : "false";
    }

    public static void main(String[] args) {
        Monkey obj = new Monkey(); //hi

        // Test cases
        System.out.println(obj.monkeyTrouble(true, true));   // should print "true"
        System.out.println(obj.monkeyTrouble(false, false)); // should print "true"
        System.out.println(obj.monkeyTrouble(true, false));  // should print "false"
        System.out.println(obj.monkeyTrouble(false, true));  // should print "false"
    }
}
