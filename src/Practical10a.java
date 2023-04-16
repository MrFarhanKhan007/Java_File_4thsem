import java.util.function.Function;

public class Practical10a {

    public static void main(String[] args) {

        Function<String, String> reverse = s -> new StringBuilder(s).reverse().toString();

        String str = "Baba Tunde";
        String reversedStr = reverse.apply(str);

        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversedStr);
    }
}

