package warmup;

public class Sleeping {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public static void main(String[] args) {
        Sleeping obj = new Sleeping(); //hi
        System.out.println(obj.sleepIn(false, false)); // should print true
        System.out.println(obj.sleepIn(true, false));  // should print false
    }
}
