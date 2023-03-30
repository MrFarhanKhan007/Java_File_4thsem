final class Example {
    final int EXAMPLE_CONSTANT = 42;

    final void exampleMethod() {
        //final method cannot be overridden
        System.out.println("This is an example method.");
    }
}

public class Experiment20 {
    public static void main(String[] args) {
        Example example = new Example();
        System.out.println("Example constant: " + example.EXAMPLE_CONSTANT);
        example.exampleMethod();
    }
}
