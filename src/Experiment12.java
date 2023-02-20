class MyException extends Exception{
    public MyException(String s){
        super(s);
    }
}
public class Experiment12 {
    public static void main(String[] args) {
        try {
            throw new MyException("This is my custom exception");
        } catch (MyException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
