import java.util.Scanner;

public class Experiment11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " , ");
        }
        System.out.println("");
        try {
            array[n + 1] = 10 / 0;

        } catch (ArithmeticException e) {
            System.out.print("First Error: ");
            System.out.println("Divide by 0 error!");
        }
        try {
            array[n + 1] = 10;
        } catch (IndexOutOfBoundsException e1) {
            System.out.print("Second Error: ");
            System.out.println("Index out of bout exception!");
        }
    }
}
