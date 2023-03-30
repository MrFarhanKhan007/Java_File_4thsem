final class ImmutableClass {
    private final int number;
    private final String text;
    public ImmutableClass(int number, String text) {
        this.number = number;
        this.text = text;
    }
    public int getNumber() {
        return number;
    }
    public String getText() {
        return text;
    }
}
public class Experiment19 {
    public static void main(String[] args) {
        ImmutableClass obj = new ImmutableClass(123, "Hello, world!");
        System.out.println(obj.getNumber()); // Output: 123
        System.out.println(obj.getText()); // Output: Hello, world!
    }}