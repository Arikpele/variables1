public class Main {
    public static void main(String[] args) {
        var firstBoxer=78.2;
        var secondBoxer=82.7;
        var weightDifference=secondBoxer-firstBoxer;
        System.out.println("разница в весе"+weightDifference+"кг");
        var over = (secondBoxer+firstBoxer)%weightDifference;
        System.out.println (over);
    }
}