public class ques4 {
    public static void generateException() {
        String text = null;
        System.out.println("Length of text: " + text.length());
    }
    public static void handleException() {
        String text = null;
        try {
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("⚠ Caught NullPointerException: Cannot call method on null object.");
        }
    }
    public static void main(String[] args) {
        handleException();
    }
}
