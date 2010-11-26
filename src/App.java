public class App {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public boolean thisCausesFindBugWarnings(String s) {
        return "abc"==s;
    }
}
