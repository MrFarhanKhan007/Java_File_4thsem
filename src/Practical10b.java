import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Practical10b {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(4);
        numbers.add(2);
        numbers.add(5);

        System.out.println("Original list: " + numbers);

        numbers.sort(Comparator.reverseOrder());

        System.out.println("List sorted in descending order: " + numbers);
    }
}
