import java.io.*;
public class Experiment23 {
    public static void main(String[] args) {
        byte[] data = { 65, 66, 67, 68, 69 };
        String fileName = "output.bin";

        try {
            FileOutputStream fileOutput = new FileOutputStream(fileName);
            fileOutput.write(data);
            fileOutput.close();
            System.out.println("Data has been written to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
