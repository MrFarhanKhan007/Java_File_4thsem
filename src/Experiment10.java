import java.util.*;

interface classA {
    Scanner scanner = new Scanner(System.in);
    public int x = scanner.nextInt();
}

interface classB {
    Scanner scanner = new Scanner(System.in);
    public int y = scanner.nextInt();
}

interface classC extends classA, classB {
    public void print(int x, int y);
}

class D implements classC {
    @Override
    public void print(int x, int y) {
        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + y);
    }
}

public class Experiment10 {
    public static void main(String[] args) {
        D d=new D();
        d.print(D.x,D.y);
    }
}
