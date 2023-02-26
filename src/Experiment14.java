import java.util.Scanner;

class MyThread extends Thread {
    public void run() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int target = 5;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = s.nextInt();
        }
        System.out.println("Array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " , ");
        }
        System.out.println("");
        for (int i = 0; i < n; i++) {
            if (array[i] == target) {
                System.out.println("Element " + array[i] + " found at " + i + "th index.");
            }
        }
    }
}

public class Experiment14 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
