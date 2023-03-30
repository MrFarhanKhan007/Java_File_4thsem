import java.io.*;

public class Experiment24 {
    public static void main(String[] args) {
        String data = "Hello, world!";
        String fileName = "output.txt";

        try {
            FileOutputStream fileOutput = new FileOutputStream(fileName);
            fileOutput.write(data.getBytes());
            fileOutput.close();
            System.out.println("Data has been written to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
